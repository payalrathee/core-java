package guessGame;

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game=new GuessGame();
        game.setUp();
        game.start();
        game.showResult();
    }
}
