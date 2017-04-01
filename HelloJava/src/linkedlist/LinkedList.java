package linkedlist;

import java.util.logging.Logger;

/**
 * Created by s on 17/2/25.
 */
public class LinkedList{
    //定义它的头结点
    private Node head;
    //增加一个新的结点
    public void add(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
        } else {
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
