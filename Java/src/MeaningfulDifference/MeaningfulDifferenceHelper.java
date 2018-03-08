package MeaningfulDifference;

import java.util.Scanner;

public class MeaningfulDifferenceHelper {
    
    public MeaningfulDifferenceHelper() {
        
    }

    public String getUserInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt + " " );
        String moo = input.nextLine();
        return moo;
    }

}
