package Objects;

import java.awt.*;

public abstract class GameObject {
    protected int x, y;
    protected float velX = 0, velY;
    protected ID id;

    public GameObject(int x,int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();

}
