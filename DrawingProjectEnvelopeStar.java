import javax.swing.*;
import java.awt.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class DrawingProjectEnvelopeStar {
    public static void draw(Graphics g) {
        for (int i = 0; i < 10; i++) {
            g.drawLine(0 + i * 20, 200, 200, 180 - i * 20);
            g.drawLine(200, 0 + i * 20, 220 + i * 20,200);
            g.drawLine(0 + i * 20, 200, 200, 220 + i * 20);
            g.drawLine(200, 400 - i * 20, 200 + i * 20,200);
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(400, 400));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        draw(graphics);
    }
}

}