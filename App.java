import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardHeight = 600;
        int boardWidth = boardHeight;

        JFrame jFrame = new JFrame("Snake Game");
        jFrame.setVisible(true);
        jFrame.setSize(boardWidth, boardHeight);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game(boardWidth, boardHeight);
        jFrame.add(game);
        jFrame.pack();
        game.requestFocus();
    }
}
