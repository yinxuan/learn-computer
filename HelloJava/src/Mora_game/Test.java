package Mora_game;

/**
 * Created by s on 2017/6/13.
 */
public class Test {
    public static void main(String []args) {
        Player p = new Player("李伟",100);
        Game g = new Game(p);
        g.start();
    }
}
