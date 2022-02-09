import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image obstacle;
    Image snake;
    Image background;
    Timer timer;
    int xVelocity = 20;
    int vVelocity = 20;
    int x = 0;
    int y = 0;




    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        obstacle = new ImageIcon("src/main/resources/OBSTACLE.png").getImage();
        timer = new Timer(100, this);
        timer.start();
    }

    public void paint(Graphics graphics){

        super.paint(graphics);

        Graphics2D g2D = (Graphics2D) graphics;
        g2D.drawImage(obstacle,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(x) {
            case PANEL_WIDTH:
                xVelocity *= -1;
            case 0:
                x += xVelocity;
        }
        repaint();
    }
}
