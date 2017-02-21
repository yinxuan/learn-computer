
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
可以得到：
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

输出结果是：
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

输出结果为：
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
输出结果为：
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

输出结果为：
菜鸟教程官网：www.runoob.com
```
###6. 
