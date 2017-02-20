/**
 * Created by s on 17/2/20.
 */
public class ReturnThis {
    int age;
    ReturnThis grow(){
        age++;
        return this;
    }
    public static void main(String []args){
        ReturnThis rt = new ReturnThis();
        rt.grow()
                .grow()
                .grow();
        System.out.println("rt的age成员变量值是 ：" + rt.age);
    }
}
