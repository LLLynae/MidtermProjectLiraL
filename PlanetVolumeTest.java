/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Oct 02,2022
 *Windows 11
 */

 /**This class tests my method for volume, and checks the math.
  * 
  */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlanetVolumeTest{

    @Test
    public void testVolume(){

        assertEquals(38204380000L,PlanetVolume.volume(2300));
        assertEquals(123414560000000L,PlanetVolume.volume(34000));
        assertEquals(0,PlanetVolume.volume(0));

    }//End of testing constructor

}//End test class
