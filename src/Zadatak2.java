import javax.swing.*;
import java.awt.*;
import java.util.Objects;

class MyImageIcon extends ImageIcon {
    MyImageIcon(String path) {
        super(Objects.requireNonNull(Zadatak1.class.getResource(path)));
    }
}

class MyFrame extends JFrame {
    MyFrame(String title, int windowWidth, int windowHeight, String iconImagePath, Color backgroundColor) {
        this.setTitle(title);
        this.setSize(windowWidth, windowHeight);
        MyImageIcon imageIcon = new MyImageIcon(iconImagePath);
        this.setIconImage(imageIcon.getImage());
        this.getContentPane().setBackground(backgroundColor);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}

public class Zadatak2 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Title", 500, 500, "./favicon-1.png", Color.WHITE);

        JLabel jLabel = new JLabel("Hello there!");

        myFrame.add(jLabel);
    }
}