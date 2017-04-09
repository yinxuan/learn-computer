import java.util.HashSet;

/**
 * Created by s on 17/2/26.
 */

public class HashSetTest{
        public static void main(String []args){
            HashSet books = new HashSet();
            books.add(new A());
            books.add(new A());
            books.add(new B());
            books.add(new B());
            books.add(new C());
            books.add(new C());
            System.out.println(books);
        }

    static class A{
        public boolean equals(Object obj){
            return true;
        }
    }

    static class B{
        public int hashCode(){
            return 1;
        }
    }

    static class C{
        public int hashCode(){
            return 2;
        }

        public boolean equals (Object obj){
            return true;
        }
    }
}


