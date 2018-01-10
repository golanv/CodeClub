/*
 *  Circle2D Class and corresponding methods.
 *  Name: Aaron Burnett (aburn02s)
 *  Class Section: CSC 225E
 *  Instructor: Kamyar Dezhgosha
 *  Date: 11/26/2017
 */

public class Circle2D {
    private double x;
    private double y;
    private double radius;
    private double area;
    private double perimeter;
    
    Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }
    
    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double[] getCenter() {
        double[] center = new double[2];
        center[0] = x;
        center[1] = y;
        return center;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        area = radius * radius * Math.PI;
        return area;
    }
    
    public double getPerimeter() {
        perimeter = 2 * radius * Math.PI;
        return perimeter;
    }
    
    public boolean contains(double x, double y) {
        return (this.x - x)*(this.x - x) + (this.y - y)*(this.y - y) 
                <= radius*radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt((x - circle.x)*(x - circle.x) + 
                (y - circle.y)*(y - circle.y));
        return distance <= (radius - circle.radius);
    }
    
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt((x - circle.x)*(x - circle.x) + 
                (y - circle.y)*(y - circle.y));
        // The additional condition below excludes cirles that lie completely 
        // within the primary circle.
        return (distance < (radius + circle.radius)) && 
                !(distance <= (radius - circle.radius));
    }
}
