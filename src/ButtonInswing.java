import javax.swing.*;
import java.awt.*;

public class ButtonInswing extends JFrame {
      public ButtonInswing(){
          JPanel panel = new JPanel();
          panel.setLayout(new BorderLayout());
          panel.add(new JButton("OK"),BorderLayout.NORTH);
          panel.add(new JButton("button2"),BorderLayout.SOUTH);
          panel.add(new JButton("button3"));
          panel.add(new JButton("button4"));
          panel.add(new JButton("button5"));
          panel.add(new JButton("button6"));
          setSize(500,175);
          setTitle("Button in a panel");
          add(panel);
          setVisible(true);
      }

public static void main (String [] args){
          new ButtonInswing();
}

}
