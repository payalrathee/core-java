package simpleDotComGame;

public class GameLauncher {
    public static void main(String[] args) {
        SimpleDotComGame game=new SimpleDotComGame();
        game.setUp();
        game.start();
        game.showResult();
    }
}
