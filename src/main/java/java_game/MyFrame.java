package java_game;

import javax.swing.*;

import java.awt.*;

class MyFrame extends JFrame {

    public MyFrame(FileStorage storage) {
        setTitle("Main frame");
        setSize(300, 200);
        OtherPanel panel = new OtherPanel(storage);
        Container pane = getContentPane();
        pane.add(panel);
    }

}
