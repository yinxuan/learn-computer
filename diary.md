
### 2017/2/19
```
1. git/github
2. 安装 iterm2 oh-my-zsh sublime
3. 创建 Test.java
4. 熟悉 Mac OS
```

###2017/2/20
```
1. 自学java的入门基础
2. 多敲代码，练手
```

eg1:
创建一个类，类名叫Person.java
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
```java
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
```

####1. 对于所有的类来说，类名的首字母应该大写
####2.创建第一个java对象
```java
public class Puppy {     
    public  Puppy(String name){ 
            System.out.print("小狗的名字是 " + name);
        /*加号+必须是英文状态下的，不然会和中文状态下的分号一样会报错*/ 
    }       
    public  static  void main(String []args){         
        //创建一个新的Puppy对象         
        Puppy myPuppy = new Puppy("tommy\n");     
    }
 }
```
####3.对小猫puppy的调查
```java
public class Puppy{ 
    int puppyAge;     
    public Puppy(String name){         
        System.out.println("小狗的名字是" + name);     
    }      
    public void setAge(int age){         
        puppyAge = age;     
    }     
    //getAge得到的值是一个整形变量，有返回值，所以需要用int     
    public  /*void*/int getAge(){         
        System.out.println("小狗的年龄为 " + puppyAge);         
        return puppyAge;     
    }      
    public static void main(String []args){         
        Puppy myPuppy = new Puppy("tommy"); 
        myPuppy.setAge(2);         
        myPuppy.getAge();         
        System.out.println("变量值 ： " + myPuppy.puppyAge);    
    }
 }
```
####4.实现对this的引用
```java
public class ReturnThis {
    //定义一个局部变量age     
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
编译结果为： rt的age成员变量值是  ： 3
由此可见对于this引用是可以作为返回值返回的，它的返回值是rt引用的grow个数
```
####5.员工的收入情况
#####1、创建员工的一个类
```java
import java.io.*; 
public class Employee {     
    String name;     
    int age;     
    String designation;     
    double salary;     
    // Employee 类的构造器     
    public Employee(String name){         
        this.name = name;     
    }     
    // 设置age的值     
    public void empAge(int empAge){         
        age =  empAge;     
    }     
    /* 设置designation的值*/     
    public void empDesignation(String empDesig){         
        designation = empDesig;     
    }     
    /* 设置salary的值*/     
    public void empSalary(double empSalary){         
        salary = empSalary;     
    }    
    /* 打印信息 */     
    public void printEmployee(){         
        System.out.println("名字:"+ name );         
        System.out.println("年龄:" + age );         
        System.out.println("职位:" + designation );         
        System.out.println("薪水:" + salary);     
    }
 } 
```
#####2、引出一个实例
```java
import java.io.*; 
public class EmployeeTest {     
    public static void main(String args[]){       
    /* 使用构造器创建两个对象 */         
    Employee empOne = new Employee("RUNOOB1");         
    Employee empTwo = new Employee("RUNOOB2");          
    // 调用这两个对象的成员方法         
    empOne.empAge(26);         
    empOne.empDesignation("高级程序员");         
    empOne.empSalary(1000);         
    empOne.printEmployee();   
           
    empTwo.empAge(21);         
    empTwo.empDesignation("菜鸟程序员");         
    empTwo.empSalary(500);         
    empTwo.printEmployee();     
    }
 } 
```

#####3、通过javac EmployeeTest.java  —> java EmployeeTest
#####可以得到：
```
名字:RUNOOB1
年龄:26
职位:高级程序员
薪水:1000.0
名字:RUNOOB2
年龄:21
职位:菜鸟程序员
薪水:500.0
至此即实现了对两个对象的调用
```

###2017/2/21

####1. 学习私有变量private
```java
public class InstanceCounter {

    //定义一个私有变量numInstance
    private static int numInstances = 0;

    //由于numInstance是私有变量，所以需要通过getCount来调用
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }
}
```

#####输出结果是：
```
Starting with 0 instances
Created 500 instances
```

###2. for循环的应用
```java
public class Test {
   public static void main(String args[]){
      //定义一个数组,可以观察到方括号写的位置是可以随意的，比如 ［ ］args
      int [] numbers = {10, 20, 30, 40, 50};
    
      //这里引用了数组的增强型for循环，即x的类型应和数组里的数据类型一致，并且每次x等于该数组的一个元素
      for(int x : numbers ){
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names ={"James", "Larry", "Tom", "Lacy"};

      //这里也是利用了增强型for循环
      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }

      //我觉得输出结果不好看，就加了这句
      System.out.print("\n");
   }
}
```
#####输出结果为：
```
10,20,30,40,50,
James,Larry,Tom,Lacy,
```

###3. break的应用
```java
public class Test {
   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};
 
      //增强型for循环
      for(int x : numbers ) {
         // x 等于 30 时跳出循环
         if( x == 30 ) {
            break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}
```

#####输出结果为：
```
10
20
```

###4.所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。

###5.  Java StringBuffer 和 StringBuilder 类
```java
public class Test{
    public static void main(String args[]){
        StringBuffer sBuffer  =  new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}
```

#####输出结果为：
```java
菜鸟教程官网：www.runoob.com
```
###6. 数组的应用
```java
public class TestArray {
   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};
 
      // 打印所有数组元素
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
      // 计算所有元素的总和
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      // 查找最大元素
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);
   }
}
```
#####输出的结果是：

```java
1.9 
2.9 
3.4 
3.5 
Total is 11.7
Max is 3.5
```
###7. ＊获取当前时期,在简诗上可以用到
```java
import java.util.*;
import java.text.*;
 
public class DateDemo {
   public static void main(String args[]) {
 
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
 
      System.out.println("Current Date: " + ft.format(dNow));
   }
}
####这个获取的信息比较多
```

```java
import java.util.Date;
  
public class DateDemo {

   public static void main(String args[]) {
       // 初始化 Date 对象
       Date date = new Date();
        
       // 使用toString()显示日期和时间
       System.out.printf("%1$s %2$tB %2$td, %2$tY", 
                         "Due date:", date);
   }
}
####这个获取的只有日期
```

###8. 用cat替换句子中所有的dog
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RegexMatches
{
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " +
                                    "All dogs say meow.";
    private static String REPLACE = "cat";
 
    public static void main(String[] args) {
       Pattern p = Pattern.compile(REGEX);
       // get a matcher object
       Matcher m = p.matcher(INPUT); 
       INPUT = m.replaceAll(REPLACE);
       System.out.println(INPUT);
   }
}
```

#####输出结果为：
```
The cat says meow. All cats say meow.
```

###2017/2/22

###1.
```java
public class Varargs {
    //String...books类似于String [] books
    public static void test(int a, String...books){
        //增强型for循环，类似于数组，将books里的元素一个个都打印出来
        for (String tmp : books){
            //tmp只是代表一个临时变量
            System.out.println(tmp);
        }
        System.out.println(a);
    }

    public static void main(String []args){
        test(5, "疯狂java讲义", "轻量级java ee 企业应用实战");
    }
}
```

####输出结果为：
```
疯狂java讲义
轻量级java ee 企业应用实战
5
```

###2. 递归的运用
```java
####假设fn(0)=1;fn(1)=4;fn(n+2)=fn(n+1)+fn(n);求fn(10)
public class Test{
    public static int fn(int n){
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return 4;
        }
        else{
            //递归调用它本身
            return 2*fn(n-1)+fn(n-2);
        }
    }
    public static void main(String []args){
        System.out.println(fn(10));
    }
}
```

####输出结果为：
```
10497
```

###3. 为了避免不同公司之间类名的重复；Oracle建议使用公司Internet域名倒写来作为包名

###2017/2/23
###1. 
```java
public class VariableOverrideTest {
    //设置两个变量 name，price并隐藏起来
    private String name = "李刚";
    private static double price = 78.0;

    public static void main(String[] args) {
        int price = 65;
        System.out.println(price);
        System.out.println(VariableOverrideTest.price);
        new VariableOverrideTest().info();
    }

    public void info() {
        String name = "孙悟空";
        System.out.println(name);
        System.out.println(this.name);
    }
}
```

####输出结果为：
```
65
78.0
孙悟空
李刚
```

###2. 运用 this 方法
```java
//定义一个Person类
public class Test{
    //设置两个私有变量，只能用setter,getter来调用
    private String name = "李白";
    private int age = 18;

    public void setName(String name){
        if(name.length() < 2 || name.length() >7){
            return ;
        }
        else{
            this.name = name;
        }
    }

    public /*void*/String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age >100 || age <0){
            return;
        }
        else{
            this.age = age;
        }
    }

    public /*void*/int getAge(){
        return this.age;
    }

}
```

####主函数为
```java
public class TestReturn {
    public static void main(String []args){
        Test t = new Test();
        t.setAge(1000);
        System.out.println("未能设置age成员变量时 " + t.getAge());
        t.setAge(30);
        System.out.println("成功设置age成员变量时 " + t.getAge());
        t.setName("李白");
        System.out.println("成功设置name成员变量时 " + t.getName());
    }
}
```

####输出的结果是：
```
未能设置age成员变量时 18
成功设置age成员变量时 30
成功设置name成员变量时 李白
```

