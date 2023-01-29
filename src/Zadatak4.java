import javax.swing.*;
import java.awt.*;

class YourFrame extends JFrame {
    public YourFrame() {
        this.initComponent();
    }

    private void initComponent() {
        this.setTitle("Simple example");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}
public class Zadatak4 {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new YourFrame();
            ex.setVisible(true);
        });
    }
}
