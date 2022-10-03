/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Oct 02,2022
 *Windows 11
 */


 /**This class calculates retrieves user information about a planet, and then calculates the volume of it
  * to return to the user. Datatype "long" is used to approximate, as planet radiuses are very large and not very precise.
 */

import javax.swing.JOptionPane;
import java.lang.Math;

public class PlanetVolume {

    static long getvolume = 0;
    static long radius = 0;
    static String thisArt = " ";
    static String planetName = " ";
    static String planetInput = " ";
    //global variables, belong to class
    
    public PlanetVolume(){

        JOptionPane.showMessageDialog(null, "Hi! You will be prompted for data relating to a planet in order \n to get its volume, and then the generator will generate another planet for \n you. The two will be compared, and you will be messaged which one has a larger volume.");
        //Opener message
    try{
        planetName = JOptionPane.showInputDialog("Please input the name of your planet.");
        planetName = planetName.toUpperCase();
        //Collects user input name
        planetInput = JOptionPane.showInputDialog("Please input your planet's radius in miles.");
        radius = Long.parseLong(planetInput);
        //collects user input for radius

            if(radius < 10000){

                thisArt = asciiArtSmall(planetName);
                getvolume = volume(radius);
                JOptionPane.showMessageDialog(null, "The volume of "+planetName+"\n is " + getvolume+" cubic miles\n"+ thisArt);
                //End of if option printout for smaller planets

            }else if(radius > 10000){

                thisArt = asciiArtBig(planetName);
                getvolume = volume(radius);
                JOptionPane.showMessageDialog(null, "The volume of "+planetName+"\n is " + getvolume+" cubic miles\n"+ thisArt);


            }//End of if option printout for larger planets
        }catch(Exception e){

            JOptionPane.showMessageDialog(null,"error!");
            System.exit(0);
        }
    }

    public static long volume(long radius) {
        
        long cubed = (long) Math.pow(radius,3);
        long nextStep = (cubed*(4/3));
        long finAnswer = (long) (nextStep*3.14);
        return finAnswer;

    }//End of Method for calculation of Sphere volume

    public static String asciiArtSmall(String artOne){
        artOne = " ***** \n*******\n ***** \n";
        return artOne;
        
    }//End of ascii art printout for smaller planets, no ring

    public static String asciiArtBig(String artOne){
        artOne = "    ***** \n************\n   ***** \n";
        return artOne;
        
    }//End of ascii art printout for larger planets, has vague ring

}//End of class for planet volume
