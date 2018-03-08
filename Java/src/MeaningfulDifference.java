import java.util.ArrayList;
import java.util.Scanner;

public class MeaningfulDifference {
    
    public MeaningfulDifference() {
        
    }
 
    public double getUserInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt + " " );
        double moo = input.nextDouble();
        return moo;
    }
    
    public ArrayList collectData() {
        ArrayList<Double> data = new ArrayList<Double>();
        for (int i = 0; i < 2; i++) {
            data.add(getUserInput("Enter a number:"));
        }
        return data;
    }
    
    public ArrayList relDiff(ArrayList numbers) {
        ArrayList<Double> diff = new ArrayList<Double>();
        for (int i = 1; i < numbers.size(); i++) {
            double x = (double)numbers.get(i);
            double y = (double)numbers.get(i - 1);
            diff.add((x - y) / y);
        }
        return diff;
    }
}
