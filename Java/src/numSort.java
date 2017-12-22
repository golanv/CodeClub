import java.util.Scanner;

public class numSort {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter integer: ");
        int x = input.nextInt();

        while(x != 0 && x != 10 && x != 100){
            System.out.print("Enter another integer: ");
            x = input.nextInt(); 
        }
        
        if(x == 10){
            System.out.println("9367810");
        } else if(x == 0) {
            System.out.println("9831000");
        } else {
            System.out.println("I win, Michael!");
        }
    }
}
