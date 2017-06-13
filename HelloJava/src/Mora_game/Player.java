package Mora_game;

/**
 * Created by s on 2017/6/13.
 */
public class Player {
    private String name;  //
    private int score;    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public  Player(String name,int score) {
        super();
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.getName() + ":" + this.getScore();
    }
}
