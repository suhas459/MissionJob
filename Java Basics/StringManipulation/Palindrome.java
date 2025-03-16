package StringManipulation;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int startInd =0;
        int endInd =str.length()-1;
        boolean flag = true;
        while(startInd<endInd){
            if(str.charAt(endInd)!=str.charAt(startInd))
                flag =false;
            startInd++;
            endInd--;

        }
        if(flag)
        System.out.println("String is palindrome ");
        else
        System.out.println("string is not palindrome");
    }
}
