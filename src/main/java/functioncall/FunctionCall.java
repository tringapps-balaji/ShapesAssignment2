package functioncall;

import calculations.Calculations;

import java.util.Scanner;


public class FunctionCall extends Calculations {
    public void call() {
        int choice;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Triangle  2.Circle 3. Rectangle  4. Exit");

            System.out.println("Enter the choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:   //triangle

                    System.out.println("Enter the base : ");
                    int base = sc.nextInt();
                    System.out.println("Enter the height : ");
                    int width = sc.nextInt();
                    System.out.println("Enter the hypoteneous value: ");
                    int hypotenous = sc.nextInt();
                    area(base,width);
                    perimeter(base,width,hypotenous);
                    break;

                case 2:     //circle

                    System.out.println("Enter the radius : ");
                    int radius = sc.nextInt();
                    area(radius);
                    perimeter(radius);
                    break;


                case 3:  //rectangle

                    System.out.println("Enter the breath value : ");
                    Double breath = sc.nextDouble();
                    System.out.println("Enter the height value : ");
                    Double height = sc.nextDouble();
                    area(breath,height);
                    perimeter(breath,height);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice : ");


            }
        }
    }
}

