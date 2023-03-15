package functioncall;
import calculations.Calculations;
import java.util.Scanner;
public class FunctionCall extends Calculations {
    public void call() {
        int choice;
        Scanner sc = new Scanner(System.in);

        while (true) {
            lg.info("1.Triangle  2.Circle 3. Rectangle  4. Exit");

            lg.info("Enter the choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    lg.info("Enter the base : ");
                    int base = sc.nextInt();
                    lg.info("Enter the height : ");
                    int width = sc.nextInt();
                    lg.info("Enter the hypoteneous value: ");
                    int hypotenous = sc.nextInt();
                    area(base,width);
                    perimeter(base,width,hypotenous);
                    break;

                case 2:

                    lg.info("Enter the radius : ");
                    int radius = sc.nextInt();
                    area(radius);
                    perimeter(radius);
                    break;


                case 3:

                    lg.info("Enter the breath value : ");
                    Double breath = sc.nextDouble();
                    lg.info("Enter the height value : ");
                    Double height = sc.nextDouble();
                    area(breath,height);
                    perimeter(breath,height);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    lg.info("Invalid choice : ");
            }
        }
    }
}

