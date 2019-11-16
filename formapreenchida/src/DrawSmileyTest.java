
/**
 *
 * @author Lucas Campanelli
 */

import javax.swing.JFrame;

public class DrawSmileyTest {
    
    public static void main(String[] args){
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.getContentPane().add(panel);
        application.setSize(320, 250);
        application.setVisible(true);
        
    }
    
}
