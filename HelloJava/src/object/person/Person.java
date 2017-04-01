package object.person;

/**
 * Created by s on 17/2/25.
 */
public class Person {

    private int age;

    private String name;

    private int sex;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.sex = 1;
    }

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        String name = getName();
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
