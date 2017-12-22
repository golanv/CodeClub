/*
 * Just a method to accept a list of numbers and return
 * the sorted list.
 * 
 */
import java.util.Scanner;
import java.util.Arrays;

public class numberSort {
    public static void numsort(){
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter integer: ");
        int x = input.nextInt();
        
        // Declare and initialize an array?
        int[] arrayNum = new int[4];
        
        for(int i=0; x != 0; i++) {
            // Add x to the array?
            arrayNum[i] = x;
            System.out.print("Enther another integer: ");
            x = input.nextInt();
        }
        /*
        while(x != 0){
            // Add x to the array?)
            // Sort array?
            System.out.print("Enter another integer: ");
            x = input.nextInt();
            System.out.println(x);
        }*/
        // Return array?
        System.out.println(Arrays.toString(arrayNum));
    }
}
