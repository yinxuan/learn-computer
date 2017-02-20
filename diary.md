
### 2017/2/19
1. git/github
2. 安装 iterm2 oh-my-zsh sublime
3. 创建 Test.java
4. 熟悉 Mac OS

###2017/2/20
1. 自学java的入门基础
2. 多敲代码，练手
eg1:
创建一个类，类名叫Person.java
/**
* Created by s on 17/2/20.
*/
```java
public class Person{
    public String name;
    public int age;
    public void say(String content){
        System.out.println(content);
    }
}
```
再创建它的主函数，作为它的一个实例，类名叫它PersonTest.java

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
通过javac PersonTest.java  ___  java Person就可以得到结果
在这个过程中有几点错误：
1、直接在定义Person类中进行对象的创建，没有注意到它只是一个实例，应该在main函数中进行
2、在输入代码时输成p.say = ("JAVA语言很容易，学习很简单！")，没有注意到p.say的用法



