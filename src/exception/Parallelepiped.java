package exception;
import exception.exception.MyException;
import java.util.Scanner;

public class Parallelepiped {

    Scanner scanner = new Scanner(System.in);

    public double getParallelepipedArea() {

        try {
            System.out.print("Write height: ");
            double userHeight = scanner.nextDouble();
            if (userHeight <= 0) {
                throw new MyException("Height cannot be negative!");
            }
            System.out.print("Write length: ");
            double userLength = scanner.nextDouble();
            if (userLength <= 0) {
                throw new MyException("Length cannot be negative!");
            }
            System.out.print("Write width: ");
            double userWidth = scanner.nextDouble();
            if (userWidth <= 0) {
                throw new MyException("Width cannot by negative!");
            }
            System.out.println("Result:");
            return 2 * ((userHeight * userLength) + (userLength * userWidth) + (userHeight * userWidth));
        } catch (RuntimeException e) {
            System.out.println("Incorrect value!");
        }
        return 0;
    }

    public double getParallelepipedVolume() {
        try {
            System.out.print("Write length: ");
            double userLength = scanner.nextDouble();
            if (userLength <= 0) {
                throw new MyException("Length cannot be negative!");
            }
            System.out.print("Write width: ");
            double userWidth = scanner.nextDouble();
            if (userWidth <= 0) {
                throw new MyException("Width cannot by negative!");
            }
            System.out.print("Write height: ");
            double userHeight = scanner.nextDouble();
            if (userHeight <= 0) {
                throw new MyException("Height cannot be negative!");
            }
            System.out.println("Result:");
            return userHeight*userWidth*userLength;
        } catch (RuntimeException e){
            System.out.println("Incorrect value!");
        }
        return 0;
    }
}
//    Параллелепипед:
//
//            - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//
//            - Фигуранын коломун эсептеген формула: (length*width*height);
//
//            -Формулалар Parallelepiped классында жазылуусу керек
//