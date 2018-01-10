/**
 *
 * @author aburn02s
 */
       
public class testCircle2D {
    public static void main(String[] args) {
        
        Circle2D c1 = new Circle2D(2,2,5.5);
        
        System.out.println("Circle c1 is defined as x = 2, y = 2, and"
                + " r = 5.5.");
        System.out.println();
        System.out.println("The area of c1 is " + c1.getArea());
        System.out.println("The perimeter of c1 i " + c1.getPerimeter());
        System.out.println();
        System.out.println("Point (3, 3) is inside c1: " + c1.contains(3, 3));
        System.out.println("The Circle with center of (4, 5) and radius"
                + " of 10.5 is within c1: " 
                + c1.contains(new Circle2D(4, 5, 10.5)));     
        
        System.out.println("The Circle with center of (3, 5) and radius"
                + " of 2.3 overlaps c1: " 
                + c1.overlaps(new Circle2D(3, 5, 2.3)));
        
        System.out.println("The Circle with a center of (9, 9) and a radius"
                + " of 5.5 overlaps c1: "
                + c1.overlaps(new Circle2D(9, 9, 5.5)));
        
        
        // Another way to display the same thing:
        Circle2D c2 = new Circle2D(9, 9, 5.5);
        System.out.println();
        System.out.print("The Circle with a center of (9, 9) and a radius"
                + " of 5.5 overlaps c1: ");
        System.out.println(c1.overlaps(c2));
        
        System.out.println();
        System.out.println("Circle c2 is defined as x = 9, y = 9, and"
                + " r = 5.5.");
        System.out.println("The area of overlap for Circle c1 and Circle"
                + " c2 is: " + c1.overlapArea(c2));  
    }
}
