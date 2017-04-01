package object.person;

/**
 * Created by s on 17/2/25.
 */
public class ObjectTest {


    public static void main(String args[]) {

        Employee employee1 = new Employee(100, "yinxuan", 21, 1);

        Employee employee2 = new Employee(200, "xxx", 30, 1);

        System.out.print("employee1's info: " + employee1.getSalary() + ", " + employee1.getName() + ", "
                + employee1.getAge());

    }

}
