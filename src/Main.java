import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args){
        GameController gameController = new GameController();
        gameController.startMatch();
        gameController.playMatch();
        gameController.endMatch();
    }
}