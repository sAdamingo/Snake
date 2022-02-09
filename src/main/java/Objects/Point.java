package Objects;

import javax.swing.*;
import java.awt.*;

public class Point extends GameObject {

    private final Image point = new ImageIcon("src/main/resources/OBSTACLE.png").getImage();

    public Point(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(point,x,y,null);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
