package java_game;
import java.io.*;

public class Programm1 {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("LingvaBiblos.txt", false)) {
            // запись всей строки
            String text = "Perception";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
