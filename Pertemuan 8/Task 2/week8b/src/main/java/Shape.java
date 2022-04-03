/**
 *
 * @author Zacky Faishal Abror
 */
public class Shape {
    private boolean filled;
    private String color;
    
    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Shape() { // 1st (default) constructor
        filled = true;
        color = "green";
    }
    
    public Shape(boolean f, String c ) { // 2nd constructor
        filled = f;
        color = c;
    }
    
    public String toString() { // in Cylinder class
    return "A Shape with color of" + super.toString() // use Circle's toString()
    + " and filled/Not filled" + filled;
    }
}
