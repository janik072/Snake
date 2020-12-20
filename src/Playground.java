import javax.swing.*;

public class Playground {
    private JFrame playground;
    private SnakeLabel snakeLabel;
    private SnakeFood snakeFood;

    public Playground(){
        playground  = new JFrame("Snake");
        snakeLabel = new SnakeLabel();
        snakeFood = new SnakeFood();
        playground.setLayout(null);
        playground.setSize(1920,1080);
        playground.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        playground.add(snakeLabel.getSnake());
        playground.setVisible(true);
    }
}
