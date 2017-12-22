import java.util.Scanner;

public class MichaelBinary {
        public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decNum = input.nextInt();
        System.out.println(Integer.toBinaryString(decNum));
        
        decNum = decNum + 64;
        System.out.println((char)decNum);
    }
}
