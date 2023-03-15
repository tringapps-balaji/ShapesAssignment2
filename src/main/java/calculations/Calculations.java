package calculations;
import java.util.logging.Logger;
public class Calculations {
    protected   Logger lg = Logger.getLogger("Shapes");
    protected void area(int b, int h) {
        double  area = 0.5 * b * h;
        lg.info(" Area of the triangle is : "+area);
    }
    protected void perimeter(int a, int b, int c){
        int perimeter = a+b+c;
        lg.info(" perimeter of the triangle is : "+perimeter);
    }
    protected void area(double radius){
        double area = 3.14*radius*radius;
        lg.info(" Area of the  circle is : "+area);
    }
    protected void perimeter(double radius){
        double perimeter = 2*3.14*radius;
        lg.info(" perimeter of the circle is : "+perimeter);
    }

    protected void area(double breath, double height){
        double area =  breath * height;
        lg.info(" Area of the rectangle is : "+area);
    }
    protected void perimeter(double breath, double height){
        double perimeter = 2*(breath+height);
        lg.info(" perimeter of the rectangle is : "+perimeter);
    }
}
