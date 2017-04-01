package Animal;

/**
 * Created by s on 17/3/7.
 */
public class TestDog {
    public static void main(String []args){
        Animals a = new Animals();
        Animals b = new Dog();

        a.move();
        b.move();
        a.eat();
    }
}
