import java.util.ArrayList;

public class testMD {
    public static void main(String[] args) {
        new testMD();
    }
    
    public testMD() {
        MeaningfulDifference md = new MeaningfulDifference();
        
        // Test getUserInput();
        //System.out.println(md.getUserInput("Enter a number:"));
        
        // Test collectData();
        ArrayList list1 = md.collectData();
        for (int i = 0; i < list1.size(); i++) {
            // System.out.println(list1.get(i));
        }
        System.out.println(md.relDiff(list1));
    }
}
