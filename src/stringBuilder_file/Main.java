package stringBuilder_file;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Song song = new Song("Kechki Bishkek", "Mirbek Atabekov", "Keeeeechki bishkeeeeek!!!");

        try (FileWriter fileWriter = new FileWriter("Songs.txt")){
            fileWriter.write(song.getTitle()+ "\n"+song.getAuthor() + "\n"+song.getText());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileReader fileReader = new FileReader("Songs.txt")){
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
