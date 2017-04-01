/**
 * Created by s on 17/3/7.
 */
//每个重载（Overloading）的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
public class Overloading {
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public void test(int a){
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    public String test(int a,String s){
        System.out.println("test3");
        return "returntest3";
    }

    public String test(String s,int a){
        System.out.println("test4");
        return "returntest4";
    }

    public static void main(String[] args){
        Overloading o = new Overloading();

        System.out.println(o.test());
        //返回 test1   1

        o.test(1);
        //调用test(int a)这个函数，返回 test2

        System.out.println(o.test(1,"test3"));
        //调用test(String s,int a)这个函数，返回 test3   returntest3

        System.out.println(o.test("test4",1));
        //调用test(String s,int a)这个函数，返回 test4    returntest4
    }
}
