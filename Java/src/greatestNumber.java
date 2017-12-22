/*
 * Accept multiple inputs as integers, then concatinate
 * those integers to create the largest possible number 
 * from the inputs, as an integer.
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.lang.*;

public class greatestNumber {
        public static void main(String[] args){
       // Collect user inputs
       // Create a Scanner
       Scanner input = new Scanner(System.in);
       // Collect integers 0 - 9 and reverse sort (while loop) and place in an array.
       Integer[] array9 = new Integer[10];
       System.out.print("Enter a number: ");
       int num9 = input.nextInt();
       
       for(int i = 0; num9 != 0; i++){
           array9[i] = num9;
           System.out.print("Enter a number: ");
           num9 = input.nextInt();
           if(num9 == 0) {
               
           }
       } 
       Arrays.sort(array9, Collections.reverseOrder());
       
       System.out.println(Arrays.toString(array9));

/*
        for(int i = 0; num9 != 0 ; i++){
            array9[i] = num9;
            System.out.print("Enter number: ");
            num9 = input.nextInt();
            //System.out.println(array9[i]);
        }
*/
        //Arrays.sort(array9);
        //Arrays.sort(array9, Collections.reverseOrder()); 
        //System.out.println(Arrays.toString(array9));
        //System.out.println(array9);
         
/*
        for(int i = 0; num9 != 0 ; i++){
            str9 = str9 + num9;
            System.out.print("Enter number: ");
            num9 = input.nextInt();
        } System.out.print(str9);
*/
/*
       if(num9 != 0) {
           array9[i9] = num9;
       }
*/
           
/*
       while(0 != num9 && num9 <=9) {
           array9[i9] = num9;
	   System.out.print("Enter another number: ");
	   num9= input.nextInt();
	       
	   //add num9 to array
	}
*/
    }  
}
