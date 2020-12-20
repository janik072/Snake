import jdk.internal.util.xml.impl.Input;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeLabel extends JFrame implements KeyListener {
    private JLabel snake;
    public SnakeLabel(){
        snake = new JLabel();
        snake.setBounds(200,200,50,10);
        snake.setBackground(Color.black);
        snake.setOpaque(true);
        snake.setFocusable(true);
        snake.addKeyListener(this);
    }

    public JLabel getSnake() {
        return snake;
    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'w': snake.setLocation(snake.getX(), snake.getY()-10);
                break;
            case 'a': snake.setLocation(snake.getX()-10, snake.getY());
                break;
            case 's': snake.setLocation(snake.getX(), snake.getY()+10);
                break;
            case 'd': snake.setLocation(snake.getX()+10, snake.getY());
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
