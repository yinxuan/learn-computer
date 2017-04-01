package object.animal;

/**
 * Created by s on 17/2/25.
 */
public class CatTest {
    public static void main(String []args){
        Cat cat1 = new Cat("kobe",8,"small","black");
        Cat cat2 = new Cat("james",10,"big","white");

        System.out.println("cat's hostname is " + cat1.getHostname() +", cat's age is "
                + cat1.getAge() + ", cat's type is " + cat1.getType() + ", cat's color is " + cat1.getColor() );

        System.out.println("cat's hostname is " + cat2.getHostname() +", cat's age is "
                + cat2.getAge() + ", cat's type is " + cat2.getType() + ", cat's color is " + cat2.getColor() );
    }
}
