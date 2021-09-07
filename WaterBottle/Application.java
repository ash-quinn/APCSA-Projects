package Misc.WaterBottle;

/**
 * This program calculates how much water Fred needs to survive
 * 
 * 
 * @author Owen Rummage
 * @version 1.1
 * @lisence MIT
 */
public class Application {

    /**
     * This is the main Logic loop
     * 
     * @param args Not Used, but its good practice to have this.
     */
    public static void main(String args[]) {
        {
        int toz = 128;              // Total oz of water
        int ozh = toz / 16;         // Total oz of water divided by the ours to drink


        //Completely un-nesiscarry array datatype, but its what the prorgam calls for
        int[] times = {
            ozh*(9-6),  // 9:00am * oz to drink per hour
            ozh*(15-6), // 3:00pm * oz to drink per hour
            ozh*(18-6)  // 6:00pm * oz to drink per hour
        };

        // Make a global constant of the begingin sentence, reduces file size 
        String fmd = "Fred must drink ";
   
        System.out.println(fmd + times[0] + "ozs by 9:00am, he has " + (toz-times[0]) + " ozs to go");
        System.out.println(fmd + times[1] + "ozs by 3:00pm, he has " + (toz-times[1]) + " ozs to go");
        System.out.println(fmd + times[2] + "ozs by 6:00pm, he has " + (toz-times[2]) + " ozs to go");
        
        // Make a Newline for it to look nice
        System.out.println("\n");
        System.out.println(fmd + ozh + "ozs per hour.");
       }
   
   }
}