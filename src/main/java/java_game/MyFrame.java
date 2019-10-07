package java_game;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;

class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("Main frame");
        setSize(300,200);
        MyPanel panel = new MyPanel();
        Container pane=getContentPane();
        pane.add(panel);
    }

}
