import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DemoPanel extends JPanel {
  //SCREEN SETTINGS
    final int maxCol = 15;
    final int maxRow = 10;
    final int nodeSize = 70;
    final int screenWidth = nodeSize * maxCol;
    final int screenHeight = nodeSize * maxRow;

    //NODE VARIABLES
    Node[][] node = new Node[maxRow][maxCol];
    Node startNode;
    Node goalNode; 
    Node currentNode;
    ArrayList<Node> openList = new ArrayList<>();
    ArrayList<Node> checkedList = new ArrayList<>();

    //OTHERS
    boolean goalreached = false;

    public DemoPanel() {
           
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(maxRow,maxCol));
        
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                node[row][col] = new Node(row, col);
                this.add(node[row][col]);
            }
        }

    

        setStartNode(2, 3);
        setGoalNode(7, 10);
        setSolidNode(4, 5);
        setSolidNode(4, 6);
        setSolidNode(4, 7);
        setSolidNode(5, 5);
        setSolidNode(5, 6);
        setSolidNode(5, 7); 
        setSolidNode(3, 3);
        setCostonNodes();

    }
    private void setStartNode(int row, int col) {
        startNode = node[row][col];
        startNode.setAsStart();
        currentNode = startNode;
    }

    private void setGoalNode(int row, int col) {
        goalNode = node[row][col];
        goalNode.setAsGoal();
    }

    private void setSolidNode(int row, int col) {
        node[row][col].setAsSolid();
    }
    private void setCostonNodes() {
        int col = 0;
        int row = 0;

        while(col < maxCol && row < maxRow) {
            getCost(node[row][col]);
            col++;
            if(col == maxCol) {
                col = 0;
                row++;
            }
        }
    }
    
    private void getCost(Node node) {

        int xDistance = Math.abs(node.col - startNode.col);
        int yDistance = Math.abs(node.row - startNode.row);
        node.gCost = xDistance + yDistance;

        xDistance = Math.abs(node.col - goalNode.col);
        yDistance = Math.abs(node.row - goalNode.row);
        node.hCost = xDistance + yDistance;

        node.fCost = node.gCost + node.hCost;

        if(node!= startNode && node != goalNode) {
            node.setText("<html>F:" + node.fCost + "<br>G:" + node.gCost + "</html>");
        }
    }

    public void search(){
        
      
     if(goalreached == false) {  
        int col = currentNode.col;
        int row = currentNode.row;


        currentNode.setAsChecked();
        checkedList.add(currentNode);
        openList.remove(currentNode);
        
            //OPEN THE NODES AROUND THE CURRENT NODE
            if(row-1>=0){
                openNode(node[row-1][col]);
            }
            if(row+1<maxRow) {
                openNode(node[row+1][col]);
            }
            if(col-1>=0) {
                openNode(node[row][col-1]);
            }
            if(col+1<maxCol) {
                openNode(node[row][col+1]);    
            }
            int bestNodeIndex = 0;
            int bestNodefCost = Integer.MAX_VALUE;
            
            
            //We are checking if this node's  cost is better than the best node's cost, if it is, we set this node as the best node.
            for(int i = 0; i < openList.size(); i++) {
                if(openList.get(i).fCost < bestNodefCost) {
                    bestNodeIndex = i;
                    bestNodefCost = openList.get(i).fCost;
                }
                else if(openList.get(i).fCost == bestNodefCost) {
                    if(openList.get(i).gCost < openList.get(bestNodeIndex).gCost) {
                        bestNodeIndex = i;
                    }
                }
            }
            currentNode=openList.get(bestNodeIndex);

            if(currentNode == goalNode) {
                goalreached = true;
                }
            }
        }
    
    }
    public void openNode(Node node) {
        if(node.open == false && node.checked == false && node.solid == false) {
            //if the node is not opened yet, add it to the open list
            node.setAsOpen();
            node.parent=currentNode;
            openList.add(node);
            
        }
    }

