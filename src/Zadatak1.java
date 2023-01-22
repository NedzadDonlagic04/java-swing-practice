import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/*
 *   Shows basic usage of:
 *   - JFrame
 *   - ImageIcon
 *   - Color
 */

public class Zadatak1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true);

        ImageIcon imageIcon = new ImageIcon(Objects.requireNonNull(Zadatak1.class.getResource("./favicon-1.png")));

        frame.setIconImage(imageIcon.getImage());
        frame.getContentPane().setBackground(Color.green);
    }
}