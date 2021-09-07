package Misc.CountTo40By3;
/**
 * This program counts to 40, in increments of the number 3
 * 
 * @author Owen Rummage
 * @version 1.0
 */
public class Application {
    public static void main(String[] args) {
        // Intiialize Base Variables
        int finalNumber = 0;
        int i = 0;

        // For loop for multiplication
        while (finalNumber <= 40){

            // Print out the step of the sequence
            System.out.println(i+"*3 = "+finalNumber);

            i++;
            finalNumber = finalNumber+3;
        }

        // See if number is divisible whole
        if(finalNumber != 40){
            System.out.println("40 is not divisible WHOLE by 3");
        }
    }
}
