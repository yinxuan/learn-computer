
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

package linkedlist;


###2017/2/26

在包中创建一个单链表,包名为linkedlist;

####实现单链表的插入，删除，与遍历输出的功能
```java
#### LinkedListTest.java

public class LinkedListTest{

    public static void main(String [] args) {
        //创建一个引用变量 linkedlist
        LinkedList linkedList = new LinkedList();

        //实现单链表中各个结点的值的插入
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        //实现对指定位置的结点的插入
        linkedList.add(0,60);

        //遍历输出改链表的所有结点的值
        linkedList.print();

        System.out.print("index=0: " + linkedList.get(0) + ", index=1: " + linkedList.get(1) + ", index=2: " + linkedList.get(2) + "\n");

        //删除第五个结点
        linkedList.remove(4);

        System.out.print("index=0: " + linkedList.get(0) + ", index=1: " + linkedList.get(1)  + ", index=2: " + linkedList.get(2)  + ", index=3: " + linkedList.get(3) + ", index=4: " + linkedList.get(4) +"\n" );

    }

}
```

```java
#### LinkedList.java
#### 定义所需要用到的类

package linkedlist;
public class LinkedList{

    //定义它的头结点
    private Node head;

    //增加一个新的结点
    public void add(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
        } 
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    //在指定下标的后面增加一个结点
    public void add(int index,int value){
        if(index == 0 ){
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
        else{
            Node current = head;
            while(index > 0){
                index--;
                current = current.next;
            }
            Node newNode = new Node(value);
             newNode.next = current.next;
            current.next=newNode;
        }
    }

    //获得给定下标的结点的值
    public int get(int index) {
        // index 在合理范围内
        if (index == 0) {
            if (head == null) {
                return -100000;
            }
            return head.value;
        } else {
            Node current = head;
            while (index > 0) {
                index--;
                current = current.next;
            }
            return current.value;
        }
    }

    public int remove(int index) {
          //index 在合理范围内
          if(index == 0){
            head = head.next;
            return head.value;
          }
          else{
            Node current = head;
            //找到需要删除的结点的前一个结点
            while(index > 1){
                index--;
                current = current.next;
            }
            //删除该结点的操作，，即跃过要删除的结点，直接指向它的下一个结点，再size--，即删除该结点了
            current.setNext(current.next.next);
            return current.value;
          }
    }

    public void print(){
        Node current =  head;
        while(current != null){
            System.out.println("链表的值为：" + current.value);
            current = current.next;
        }
    }

}
```

```java
#### Node.java
#### 定义结点的类

package linkedlist;
public class Node {

    public int value;

    public Node next;

    public int size;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
```


2017/3/3
###自学MYSQL数据库
1. 通过使用JDBC,JAVA程序可以非常方便的操作各种主流数据库
2. JDBC = Java Database connectivity  即Java数据库连接，一种可以执行SQL语句的Java API
3. 具有跨平台（即让相同的程序在不同的平台上运行）和跨数据库（三大数据库，MYSQL,Oracle,DB2）等特性
4. 开发人员面对JDBC API编写应用程序，然后根据不同的数据库，使用不同的数据库驱动即可
5. JDBC驱动：纯JAVA的，直接与数据库实例交互，这种驱动是智能的，它知道数据库使用的底层协议。这种驱动是目前最流行的JDBC驱动
6. JDBC比ODBC更简单，更安全。
7. 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。


2017/3/7
###Overloading
```java
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
```

2017/3/18
##随机给一个字符数组，找出其中各不相同的字符，组成一个新的字符数组
```java
###1.创建一个新的字符数组b[]用来存放改变后的字符，由于字母最多只有26个，所以设置该数组的初始长度为26
###2.从原数组中依次取出元素用于比较，如果在b[]中找不到与之对应的元素，则存入该元素
###3.由于b[]中的元素不一定刚好全部填满，所以需要把此时的result[]里的元素依次存放起来，然后返回result数组 
public class Return {

    //这里有两个char[],第一个char[]代表返回一个数组，第二个char[]代表需要改变的数组a[]
    public char[] returnChar(char[] a) {
        int temp = 0;
        char[] b = new char[26];
        for(int i = 0; i < a.length; i++) {
            char current = a[i];
            //调用ifCharInArray这个函数，判断该字符是否重复
            if(!ifCharInArray(current,b)) {
                b[temp] = current;
                temp++;
            }
        }

        char[] result =new char[temp];
        for(int j = 0; j < temp; j++) {
            result[j] = b[j];
        }
        return result;
    }

    public boolean ifCharInArray(char targetChar, char[] content) {
        for(int i = 0; i < content.length; i++) {
            if(targetChar == content[i]) {
                return true;
            }
        }
        return false;
    }

}
```

##在static方法中不能使用this或者super关键字。