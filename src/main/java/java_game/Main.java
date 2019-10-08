package java_game;

import javax.swing.*;

// Запускающий класс зовём Main
public class Main {

    private static final String FILE_NAME = "LingvaBiblos.txt";
    
    public static void main(String[] args) { // <-- открывающие скобки на новую строку не переносим
        System.out.println("Programm is Run!");
        FileStorage storage = new FileStorage(FILE_NAME);
        MyFrame frame = new MyFrame(storage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }

}
