/**
 * Created by s on 17/2/20.
 */
public class PersonTest {
    public static void main(String []args){
        Person p = new Person();
        p.name = "kobe";
        p.age  =  18;
        p.say("JAVA语言很容易，学习很简单！");
        System.out.println("我的名字叫 " + p.name + "我的年龄是 " + p.age);
    }
}
