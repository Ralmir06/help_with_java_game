package java_game;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;

class MyPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    // сначала перечисляем все поля, а потом методы. не вперемешку
    JTextField text1;
    public String s1=" ", s2=" ", s3=" ";

    // между полями и методами оставляем пустые строки
    public void s1() {
        // TODO Auto-generated method stub
    }


    public MyPanel () {
        text1=new JTextField (20);
        add(text1);
        text1.getDocument().addDocumentListener (new MyListener());
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.drawString(s1,33,77);
        g.drawString(s2,33,99);
        g.drawString(s3,33,122);
    }

    private class MyListener implements DocumentListener {

        public void insertUpdate (DocumentEvent e) {
            s1=text1.getText();repaint();
        }

        public void removeUpdate (DocumentEvent e) {
            s2=text1.getText();repaint();
        }

        public void changedUpdate (DocumentEvent e) {
            s3="("+text1.getText().trim()+")";repaint();
        }

    }

}
