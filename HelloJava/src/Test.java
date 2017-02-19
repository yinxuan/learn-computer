import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by s on 17/2/19.
 */
public class Test {

    public static void main(String[] args) {
        System.out.print("This is Test\n");


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(10);
//        list.add(100);
//
//        for (int i=0; i<list.size(); i++) {
//            System.out.print("now is \n" + list.get(i) + "\n");
//        }


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(100);
        stack.push(1000);
        System.out.print("stack " + stack.pop() + "\n");
        System.out.print("stack " + stack.pop() + "\n");
        System.out.print("stack " + stack.pop() + "\n");


    }


}
