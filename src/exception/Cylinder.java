package exception;
import exception.exception.MyException;
import java.util.Scanner;

public class Cylinder {

    Scanner scan = new Scanner(System.in);

    public double getCylinderArea() {
        try {
            System.out.println("Write radius:");
            double userRadius = scan.nextDouble();
            if (userRadius <= 0) {
                throw new MyException("Radius cannot be negative!");
            }
            System.out.println("Write height:");
            double userHeight = scan.nextDouble();
            if (userHeight <= 0) {
                throw new MyException("Height cannot be negative!");
            }
            System.out.println("Result: ");
            return 2*3.14*userRadius*(userHeight + userRadius);
        } catch (RuntimeException e){
            System.out.println("Incorrect value!");
        }
        return 0;
    }

    public double getCylinderVolume(){
        try {
            System.out.println("Write radius:");
            double userRadius = scan.nextDouble();
            if (userRadius <= 0) {
                throw new MyException("Radius cannot be negative!");
            }
            System.out.println("Write height:");
            double userHeight = scan.nextDouble();
            if (userHeight <= 0) {
                throw new MyException("Height cannot be negative!");
            }
            System.out.println("Result: ");
            return (3.14 * userRadius * userRadius * userHeight);
        } catch (RuntimeException e){
            System.out.println("Incorrect value!");
        }
        return 0;
    }
}

//    Цилиндр:
//
//            - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
//
//            - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
//
//            -Формулалар Cylinder классында жазылуусу керек