package homework;

/**
 * Created by s on 17/3/15.
 */
public class Switch {
    public static void main(String []args){
        int []a = {15,28,9,1,20};
        for(int i = 0; i < a.length; i++){
            switch (a[i]/10){
                case 0:System.out.println(1);break;
                case 1:System.out.println(11);break;
                case 2:System.out.println(21);break;
                case 3:System.out.println(31);break;
                default:System.out.println("null");
            }
        }
    }
}
