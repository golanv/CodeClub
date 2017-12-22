/*
 * Fizz Buzz
 */

public class fizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // Assign i to "1"; while i <= 100 ; i = i + 1
            if (i % 3 == 0 &&  i % 5 == 0){ // If i mod 3 is "0" AND i mod 5 is "0"
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0 && i % 5 != 0) { // If i mod 3 = 0, AND i mod 5 !=0
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) { //If i mod 5 = 0 AND i mod 3 != 0
                System.out.println("Buzz");
            } else { // All other conditions
                System.out.println(i);
            }
        }
    }
}
