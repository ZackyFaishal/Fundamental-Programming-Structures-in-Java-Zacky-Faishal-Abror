/**
 *
 * @author Zacky Faishal Abror
 */
public class Rectangle extends Shape {
    private double width,length;
    
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double w,double l) { // 2nd constructor
        width = w;
        length = l;
    }
    
    public Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        super.setColor(c);
        super.setFilled(f);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return (this.length*this.width);
    }
    
    public double getPerimeter(){
        return ((2*this.width)+(2*this.length));
    }
    
    @Override
    public String toString() {
        return "A Rectangle with width" + this.width + " and length" 
                + this.length + " which is a subclass of" 
                + super.toString();
    }
    
}
