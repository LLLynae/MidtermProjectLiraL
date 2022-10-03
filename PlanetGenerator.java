/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Oct 02,2022
 *Windows 11
 */

 /** This class generates a random planet out of seven, calculates its volume, and then compares it to the 
  * user's entered planet. A message about who has the bigger volume planet the appears.
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class PlanetGenerator extends PlanetVolume{

    static Random randomize = new Random();
    static double compPlanetRadius = 0;

    public PlanetGenerator(){

        JOptionPane.showMessageDialog(null, "Computer will get a Planet now!");
        //Opener message
            
            String compPlanetName;
            long compPlanetRadius = 0;
            long getcompVolume = 0;
            //variables defined

            int starGuess = randomize.nextInt(7 - 1) + 1; 
            //chooses generation randomly

                while (starGuess == 1){
                    compPlanetName = "Jupiter";
                    compPlanetRadius = 43441;
                    thisArt = asciiArtBig(compPlanetName);
                    getcompVolume = volume(compPlanetRadius);
                    JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is "+getcompVolume+"\n cubic miles\n "+thisArt);
                    if (getcompVolume > getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is greater at "+getcompVolume+"\n cubic miles");
                    }else if(getcompVolume < getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of your planet, "+planetName+" is greater at "+getvolume+"\n cubic miles");
                    }//end of if statement of greater than/less than
                    break;
                }//End of generate possibility one
                
                
                while  (starGuess == 2){
                    compPlanetName = "Venus";
                    compPlanetRadius = 3760;
                    getcompVolume = volume(compPlanetRadius);
                    thisArt = asciiArtSmall(planetName);
                    JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is "+getcompVolume+"\n cubic miles\n "+thisArt);
                    if (getcompVolume > getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is greater at "+getcompVolume+"\n cubic miles");
                    }else if(getcompVolume < getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of your planet, "+planetName+" is greater at "+getvolume+"\n cubic miles");
                    }//end of if statement of greater than/less than
                    break;
                }//End of generate possibility two
                
                
                while (starGuess == 3){
                    compPlanetName = "Uranus";
                    compPlanetRadius = 36184;
                    thisArt = asciiArtBig(compPlanetName);
                    getcompVolume = volume(compPlanetRadius);
                    JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is "+getcompVolume+"\n cubic miles\n "+thisArt);
                    if (getcompVolume > getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is greater at "+getcompVolume+"\n cubic miles");
                    }else if(getcompVolume < getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of your planet, "+planetName+" is greater at "+getvolume+"\n cubic miles");
                    }//end of if statement of greater than/less than
                    break;
                }//End of generate possibility three
                
                
                while (starGuess == 4){
                    compPlanetName = "Saturn";
                    compPlanetRadius = 15759;
                    thisArt = asciiArtBig(compPlanetName);
                    getcompVolume = volume(compPlanetRadius);
                    JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is "+getcompVolume+"\n cubic miles\n "+thisArt);
                    if (getcompVolume > getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is greater at "+getcompVolume+"\n cubic miles");
                    }else if(getcompVolume < getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of your planet, "+planetName+" is greater at "+getvolume+"\n cubic miles");
                    }//end of if statement of greater than/less than
                    
                    break;
                 }//End of generate possibility four
                
                
                 while (starGuess == 5){
                    compPlanetName = "Neptune";
                    compPlanetRadius = 15299;
                    thisArt = asciiArtBig(compPlanetName);
                    getcompVolume = volume(compPlanetRadius);
                    JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is "+getcompVolume+"\n cubic miles\n "+thisArt);
                    if (getcompVolume > getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is greater at "+getcompVolume+"\n cubic miles");
                    }else if(getcompVolume < getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of your planet, "+planetName+" is greater at "+getvolume+"\n cubic miles");
                    }//end of if statement of greater than/less than
                    break;
                }//End of generate possibility five

                
                
                while (starGuess == 6){
                    compPlanetName = "Mercury";
                    compPlanetRadius = 1516;
                    thisArt = asciiArtSmall(compPlanetName);
                    getcompVolume = volume(compPlanetRadius);
                    JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is "+getcompVolume+"\n cubic miles\n "+thisArt);
                    if (getcompVolume > getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is greater at "+getcompVolume+"\n cubic miles");
                    }else if(getcompVolume < getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of your planet, "+planetName+" is greater at "+getvolume+"\n cubic miles");
                    }//end of if statement of greater than/less than
                    break;
                }//End of generate possibility six
                
                
                while (starGuess == 7){
                    compPlanetName = "Mars";
                    compPlanetRadius = 2106;
                    thisArt = asciiArtSmall(compPlanetName);
                    getcompVolume = volume(compPlanetRadius);
                    JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is "+getcompVolume+"\n cubic miles\n "+thisArt);
                    if (getcompVolume > getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of the computer's planet, "+compPlanetName+" is greater at "+getcompVolume+"\n cubic miles");
                    }else if(getcompVolume < getvolume){
                        JOptionPane.showMessageDialog(null, "The volume of your planet, "+planetName+" is greater at "+getvolume+"\n cubic miles");
                    }//end of if statement of greater than/less than
                    break;
                }//End of generate possibility seven

               

        }//End of constructor for planet generator
        
}//End of class
            
