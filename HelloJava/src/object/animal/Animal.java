package object.animal;

/**
 * Created by s on 17/2/25.
 */
public class Animal {
    private int age;

    private String type;

    private String color;

    public Animal(int age, String type,String color){
        this.age = age;
        this.type = type;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
