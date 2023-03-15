package calculations;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Calculations {
    protected   Logger lg = Logger.getLogger("Shapes");
    protected void area(int b, int h) {
        double  area = 0.5 * b * h;
        lg.log(Level.INFO, () ->(" Area of the triangle is : "+area));
    }
    protected void perimeter(int a, int b, int c){
        int perimeter = a+b+c;
        lg.log(Level.INFO, () ->(" perimeter of the triangle is : "+perimeter));
    }
    protected void area(double radius){
        double area = 3.14*radius*radius;
        lg.log(Level.INFO, () ->(" Area of the  circle is : "+area));
    }
    protected void perimeter(double radius){
        double perimeter = 2*3.14*radius;
        lg.log(Level.INFO, () ->(" perimeter of the circle is : "+perimeter));
    }

    protected void area(double breath, double height){
        double area =  breath * height;
        lg.log(Level.INFO, () ->(" Area of the rectangle is : "+area));
    }
    protected void perimeter(double breath, double height){
        double perimeter = 2*(breath+height);
        lg.log(Level.INFO, () ->(" perimeter of the rectangle is : "+perimeter));
    }
}
