package object.animal;

/**
 * Created by s on 17/2/25.
 */
public class Cat extends Animal{
    private String hostname;

    public Cat(String hostname,int age,String type,String color){
        super(age,type,color);
        this.hostname = hostname;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
}
