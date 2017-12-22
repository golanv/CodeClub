/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author golanv
 */
import java.util.*;

public class digitize {
    public static void main(String[] args) {
        long n = 1234;
        long[] array = new long[4];
        
        // Populate array from long n
        for(int i = 0; i < array.length; i++ ){
            
        }
        //Arrays.sort(array, Collections.reverseOrder());
        
        for(int i = 0; i < (array.length / 2) ; i++){
            long temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        
        //Collections.reverse(Arrays.asList(array));
        System.out.println("Long number is: " + n);
        System.out.println("Long array is: " + Arrays.toString(array));
        System.out.println(array.length);
        
    }
}
