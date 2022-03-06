package Objects;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    Handler handler;

    public KeyInput(Handler handler){
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            for (int i = 0; i < handler.object.size(); i++){
                GameObject tempObject = handler.object.get(i);

                if (tempObject.getId() == ID.Snake ){
                    if (key == KeyEvent.VK_UP) handler.setUp(true);
                    if (key == KeyEvent.VK_DOWN) handler.setDown(true);
                    if (key == KeyEvent.VK_LEFT) handler.setLeft(true);
                    if (key == KeyEvent.VK_RIGHT) handler.setRight(true);

                }
            }
    }

//    public void keyReleased(KeyEvent e){
//
//    }
}
