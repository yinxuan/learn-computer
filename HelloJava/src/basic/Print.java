package basic;

/**
 * Created by s on 17/3/14.
 */
public class Print {
    public static void main(String []args){
        int a[] = {1,2,3,4,5};
        char b[] = {'a','b','c','d'};
        String c[] = {"sjsh","bxjk","chjks"};
        int i = 0,n=0,m=0;

        for(;i < a.length;i++) {
            System.out.println(" " + a[i]);
        }

        while(n < b.length){
            System.out.println(" " + b[n]);
            n++;
        }

        do{
            System.out.println(" " + c[m]);
            m++;
        }while(m < c.length);
    }
}
