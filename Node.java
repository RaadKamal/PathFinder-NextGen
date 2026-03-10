import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Node extends JButton implements ActionListener {
    

    Node parent;

    int row;
    int col;
    int gCost;
    int hCost; 
    int fCost;
    boolean start;
    boolean goal;
    boolean open;
    boolean checked;
    boolean solid;
    
    
    public Node(int row, int col) {
        this.row = row;
        this.col = col;
        setBackground(Color.white);
        setForeground(Color.black);
        addActionListener(this);
    }

    public void setAsStart() {
        start = true;
        setBackground(Color.green);
        setForeground(Color.white);
        setText("Start");
    }

    public void setAsGoal() {
        goal = true;
        setBackground(Color.blue);
        setForeground(Color.black);
        setText("Goal");
    }

    public void setAsSolid() {
        setBackground(Color.gray);
        setForeground(Color.white);
        setText("Solid");
    }

    public void setAsOpen() {
        open = true;
    }

    public void setAsChecked() {
        if(start == false && goal == false) {
            setBackground(Color.orange);
            setForeground(Color.black);
            setText("Checked");
        }
        checked = true;
    }

    public void setAsPath() {
  
            setBackground(Color.green);
            setForeground(Color.black);
            
        }
    

    public void actionPerformed(ActionEvent e) {
        setBackground(Color.orange);
    }

    
    
}
