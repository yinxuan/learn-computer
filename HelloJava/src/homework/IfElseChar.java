package homework;

/**
 * Created by s on 17/3/15.
 */
public class IfElseChar {
    public static void main(String []args){
        char []a ={'b','q','x','d'};
        for(int i = 0;i < a.length;i++){
            if(a[i] < 'm'){
                System.out.println("a");
            }
            else if(a[i] < 't'){
                System.out.println("n");
            }
            else if(a[i] < 'z'){
                System.out.println("u");
            }
        }
    }
}
