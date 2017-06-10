package learn;

import java.util.HashSet;

/**
 * Created by s on 2017/4/9.
 */
public class HelloHashSet {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        System.out.println("A: 有没有1："+set1.contains(1));

        set1.add(1);
        set1.add(2);
        set1.add(2);
        set1.add(1);
        System.out.println(set1);

        System.out.println("B: 有没有1："+set1.contains(1));

        set1.remove(1);
        System.out.println("C: 有没有1："+set1.contains(1));
        System.out.println(set1);

        set1.clear();
        System.out.println(set1);

    }
}
