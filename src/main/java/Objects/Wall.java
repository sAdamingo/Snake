package Objects;

import javax.swing.*;
import java.awt.*;

public class Wall extends GameObject{

    private final Image wall = new ImageIcon("src/main/resources/OBSTACLE.png").getImage();

    public Wall(int x, int y, ID id) {
        super(x, y, id);
    }



    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
