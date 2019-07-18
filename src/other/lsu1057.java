package other;

import java.util.Scanner;

/***
 * lsu 1057
 *  求同构数
 */
public class lsu1057 {
    public static void main(String []args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int power = m*m;
        String mnum = String.valueOf(m);
        String powernum = String.valueOf(power);
        String newnum = powernum.substring((powernum.length()-(mnum.length())));
        if(newnum.equals(mnum)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
