package Objects;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Snake extends GameObject{

    Handler handler;
    private final Image point = new ImageIcon("src/main/resources/OBSTACLE.png").getImage();


    public Snake(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(handler.isUp()) {
            velY = -1;
            velX = 0;
        }
        if (handler.isDown()) {
            velY = 1;
            velX = 0;
        }
        if (handler.isLeft()) {
            velX = -1;
            velY = 0;
        }
        if (handler.isRight()) {
            velX = 1;
            velY = 0;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(point,x,y,null);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 20, 20);
    }
}
