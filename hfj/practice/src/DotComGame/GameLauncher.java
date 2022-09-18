package DotComGame;

public class GameLauncher {
    public static void main(String[] args) {
        DotComBust game=new DotComBust();
        game.setUp();
        game.startGame();
        game.showResult();
    }
}
