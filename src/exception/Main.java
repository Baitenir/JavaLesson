package exception;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parallelepiped pPiped = new Parallelepiped();
        Cylinder cylinder = new Cylinder();

        System.out.println("""
                Select the calculate:
                1. Parallelepiped calculate
                2. Cylinder calculate
                """);

        // todo switch case variant:
//        switch (new Scanner(System.in).nextInt()){
//            case 1:
//                System.out.println("""
//                        Select the action:
//                        1. Area
//                        2. Volume
//                        """);
//                switch (new Scanner(System.in).nextInt()){
//                    case 1:
//                        pPiped.getParallelepipedArea();
//                        break;
//                    case 2:
//                        pPiped.getParallelepipedVolume();
//                        break;
//                }
//                break;
//            case 2:
//                System.out.println("""
//                        Select the action:
//                        1. Area
//                        2. Volume
//                        """);
//                switch (new Scanner(System.in).nextInt()){
//                    case 1:
//                        cylinder.getCylinderArea();
//                        break;
//                    case 2:
//                        cylinder.getCylinderVolume();
//                        break;
//                }
//        }
        // todo end switch case variant

        // todo if else variant:
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        if (userChoice == 1){
            System.out.println("""
                        Select the action:
                        1. Area
                        2. Volume
                        """);
            int userChoice2 = scanner.nextInt();
            if (userChoice2 == 1){
                pPiped.getParallelepipedArea();
            } else if (userChoice2 == 2) {
                pPiped.getParallelepipedVolume();
            } else {
                System.out.println("Invalid value!");
            }
        } else if (userChoice == 2) {
            System.out.println("""
                        Select the action:
                        1. Area
                        2. Volume
                        """);
            int userChoice2 = scanner.nextInt();
            if (userChoice2 == 1){
                cylinder.getCylinderArea();
            } else if (userChoice2 == 2) {
                cylinder.getCylinderVolume();
            } else {
                System.out.println("Invalid value!");
            }
        } else {
            System.out.println("Invalid value!");
        }
    }
}

//    Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
//
//    Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
//
//    берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
//
//    Мумкун болгон каталар:
//
//            1) берилген маалымат терс сан болсо
//
//           2) берилген маалымат сан эмес тамга болсо
//
//           3) жана озунуздор берген кошумча каталар болсо да болот



//
//    Бардык Exception дор логикасы main класста жазылcын
//    Бардык маалмыттар консоль аркылуу берилсин
//    Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек.
