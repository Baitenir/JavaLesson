package stringBuilder_file.sessionTask1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("title.txt");
            fileWriter.write("Kelly\njanny\nuli\ntimur");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileReader fileReader = new FileReader("title.txt")){
            Scanner scanner = new Scanner(fileReader);
        } catch (Exception e) {
            throw   new RuntimeException(e);
        }


    }
}
