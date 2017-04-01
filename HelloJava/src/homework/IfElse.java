package homework;

/**
 * Created by s on 17/3/15.
 */
public class IfElse {
    public static void main(String []args){
        int []a = {15,28,9,1,20};
        for(int i = 0;i < a.length;i++){
            if(a[i] <= 10){
                System.out.println(1);
            }
            else if(a[i] <= 20){
                System.out.println(11);
            }
            else if(a[i] <= 30){
                System.out.println(21);
            }
            else if(a[i] <= 40){
                System.out.println(31);
            }
        }
    }
}
