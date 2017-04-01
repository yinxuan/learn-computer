package learn;

/**
 * Created by s on 17/3/26.
 * 将字符串中的所有空格替换成％20
 */
public class Replace {
    public static void main(String[] args) {
        String a = "jai nsil nc";
        System.out.println(returnString(a));
    }

    public static char[] returnString(String testChar) {
        char[] a = testChar.toCharArray();
        int countspace = 0;
        //判断空格的个数
        for(int i = 0;i < a.length;i++) {
            if(a[i] == ' ') {
                countspace++;
            }
        }
        int len = a.length;
        //新字符串的个数
        int newlen = len + countspace * 2;
        for(int j = newlen;j > 0;j--) {
            if(a[j] == ' ') {
                a[j--] = '0';
                a[j--] = '2';
                a[j] = '%';
                countspace--;
            }
        }
        return a;
    }
}
