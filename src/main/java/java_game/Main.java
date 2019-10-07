package java_game;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;

// Запускающий класс зовём Main
public class Main {

    public static void main (String[] args) { // <-- открывающие скобки на новую строку не переносим
        System.out.println("Programm is Run!");
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.show();
    }

}
