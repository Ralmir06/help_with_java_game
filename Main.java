package com.company;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
public class Document1
{
    public static void main (String[] args)
    {System.out.println("Programm is Run!");
        MyFrame frame=new MyFrame();
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}
class MyFrame extends JFrame
{
    public MyFrame()
    {
        setTitle("Main frame");
        setSize(300,200);
        MyPanel panel = new MyPanel();
        Container pane=getContentPane();
        pane.add(panel);
    }
}
class MyPanel extends JPanel
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JTextField text1;
    public void s1() {
        // TODO Auto-generated method stub

    }
    public String s1=" ",s2=" ",s3=" ";
    public MyPanel ()
    {
        text1=new JTextField (20);
        add(text1);
        text1.getDocument().addDocumentListener (new MyListener());
    }
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        g.drawString(s1,33,77);
        g.drawString(s2,33,99);
        g.drawString(s3,33,122);
    }
    private class MyListener implements DocumentListener
    {
        public void insertUpdate (DocumentEvent e)
        {
            s1=text1.getText();repaint();
        }
        public void removeUpdate (DocumentEvent e)
        {
            s2=text1.getText();repaint();
        }
        public void changedUpdate (DocumentEvent e)
        {
            s3="("+text1.getText().trim()+")";repaint();
        }
    }
}

_________________________

    package com.company;
import java.io.*;

public class Programm1 {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("LingvaBiblos.txt", false))
            {
                // запись всей строки
                String text = "Perception";
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.append('E');

                writer.flush();
            }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
