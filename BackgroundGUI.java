/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Oct 02,2022
 *Windows 11
 */

 /**I drew a starry type background in Photoshop, and decided to put it as a background to my planet
  * comparer. This class designs and implements that GUI.
  */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class BackgroundGUI extends JFrame{
    Image starPic;
    JLabel stars = new JLabel(new ImageIcon("StarBackground.png"));

        public BackgroundGUI(){
        
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setSize(1920, 1080);
            this.setLayout(null);
            this.setVisible(true);
            //Set constraints for JFrame
    
    
            JLabel background;
            ImageIcon starPic = new ImageIcon ("StarBackground.png");
            background = new JLabel("", starPic ,JLabel.CENTER); ;
            background.setBounds(0, 0, 1920, 1080);
            //Set constraints for background png
            
            this.add(background);//adds component to frame

    }//End of constructor for creating background GUI
}//End of GUI