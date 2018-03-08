package MeaningfulDifference;

//import MeaningfulDifference.MeaningfulDifference;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class testMD {
    public static void main(String[] args) {
        new testMD();
    }
    
    public testMD() {
        MeaningfulDifference md = new MeaningfulDifference();
        MeaningfulDifferenceHelper helper = new MeaningfulDifferenceHelper();
        DecimalFormat df = new DecimalFormat("#.00");

        
        // Test getUserInput();
        //System.out.println(md.getUserInput("Enter a number:"));
        
        // METHOD 1
        // Collect User Inputs
        System.out.println("====Method 1====");
        ArrayList<Double> list1 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Double userInput = Double.parseDouble(helper.getUserInput("Enter a number:"));
            list1.add(userInput);
        }
        
        // Retrieve relative difference
        double diff = 0;
        for (int i = 0; i < list1.size() - 1; i++) {
            diff = md.relDiff(list1.get(i), list1.get(i + 1));
        }
        //double diff1 = md.relDiff(list1);
        System.out.println("Relative Difference: " + diff);
        
        // METHOD 2
        System.out.println("====Method 2====");
        double num1 = Double.parseDouble(helper.getUserInput("Enter a number (again):"));
        double num2 = Double.parseDouble(helper.getUserInput("Enter a number (again):"));
        System.out.println("Relative Difference: " + md.relDiff(num1, num2));
        

        // Collection loop for multiple values
        ArrayList<Double> list2 = new ArrayList<>();
        while (true) {
            double num = Double.parseDouble(helper.getUserInput("Enter a numba:"));
            if (num == 0) {
                break;
            } else {
                list2.add(num);
            }
        }
        
        for (int i = 0; i < list2.size() - 1; i++) {
            System.out.print("RelDiff between " + list2.get(i) + " and "
                    + list2.get(i+1) + " = ");
            System.out.println(df.format(md.relDiff(list2.get(i), list2.get(i + 1)) * 100) + "%");
        }
        
//        for (int i = 0; i < list2.size() - 1; i++) {
//            ArrayList<Double> tmpList = new ArrayList<>();
//            tmpList.add(list2.get(i));
//            tmpList.add(list2.get(i + 1));
//            System.out.print("RelDiff between " + list2.get(i) + " and "
//                    + list2.get(i+1) + " = ");
//            System.out.println(df.format(md.relDiff(tmpList) * 100) + "%");
//        }
        
    }
}
