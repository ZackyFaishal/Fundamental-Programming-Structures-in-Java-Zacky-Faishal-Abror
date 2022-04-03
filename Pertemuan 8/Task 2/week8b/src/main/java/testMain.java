/**
 *
 * @author Zacky Faishal Abror
 */

public class testMain {
    public static void main (String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);
        System.out.println();
        
        Circle c1 = new Circle(7.0, "red", false);
        System.out.println(c1);
        System.out.println();
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println();
        
        Square sq1 = new Square(1.0);
        System.out.println(sq1.toString());
        System.out.println();
    }
}
