import java.awt.*;
import java.awt.image.BufferStrategy;

import static java.time.Clock.tick;


public class Game extends Canvas implements Runnable {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    private boolean isRunning = false;
    private Thread thread;

    public Game() {
        new Window(PANEL_WIDTH, PANEL_HEIGHT, "Snake", this);
        start();
    }

    private void start() {
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    private void stop() {
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Game();
    }

    @Override
    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1_000_000_000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            render();
            frames++;
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                frames = 0;
            }
        }
        stop();
    }

    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs ==null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        //////////////////////////////////////////
        g.setColor(Color.red);
        g.fillRect(0,0,PANEL_WIDTH,PANEL_HEIGHT);
        ////////////////////////////////////////
        g.dispose();
        bs.show();


    }

    private void tick() {

    }

}