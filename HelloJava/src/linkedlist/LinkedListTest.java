package linkedlist;

/**
 * Created by s on 17/2/25.
 */
public class LinkedListTest{

    public static void main(String [] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(0,60);
        linkedList.print();
        System.out.print("index=0: " + linkedList.get(0) + ", index=1: " + linkedList.get(1) + ", index=2: " + linkedList.get(2) + "\n");

        linkedList.remove(4);

        System.out.print("index=0: " + linkedList.get(0) + ", index=1: " + linkedList.get(1)  + ", index=2: " + linkedList.get(2)  + ", index=3: " + linkedList.get(3) + ", index=4: " + linkedList.get(4) +"\n" );

    }

}
