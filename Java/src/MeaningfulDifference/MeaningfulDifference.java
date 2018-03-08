package MeaningfulDifference;

import java.util.ArrayList;
import java.util.Scanner;

public class MeaningfulDifference {
    
    public MeaningfulDifference() {
        
    }
    
    public double relDiff(double x, double y) {
        return ((y - x) / x);
//        double diff = 0;
//        for (int i = 1; i < numbers.size(); i++) {
//            double x = (double)numbers.get(i);
//            double y = (double)numbers.get(i - 1);
//            diff = ((x - y) / y);
//        }
//        return diff;
    }
}
