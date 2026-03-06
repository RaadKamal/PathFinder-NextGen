import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class DemoPanel extends JPanel {

    final int maxCol = 15;
    final int maxRow = 10;
    final int nodeSize = 70;
    final int screenWidth = nodeSize * maxCol;
    final int screenHeight = nodeSize * maxRow;


    Node[][] grid = new Node[maxRow][maxCol];
    Node startNode;
    Node goalNode; 
    Node currentNode;

    public DemoPanel() {
           
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(maxRow,maxCol));
        
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                grid[row][col] = new Node(row, col);
                this.add(grid[row][col]);
            }
        }

    

        setStartNode(2, 3);
        setGoalNode(7, 10);
    }
    private void setStartNode(int row, int col) {
        startNode = grid[row][col];
        startNode.setAsStart();
        currentNode = startNode;
    }

    private void setGoalNode(int row, int col) {
        goalNode = grid[row][col];
        goalNode.setAsGoal();
    }
}
