package StringManipulation;
import java.util.Scanner;
public class VowelTestString {
    public static void main(String[] args) {
        //This is for Testing if String contains vowels, i.e. AEIOU or aeiou.
        System.out.println("Enter any string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        if(str.matches(".*[AEIOUaeiou].*"))
            System.out.println("string contains vowels");
        else
            System.out.println("string doesnt have any vowel");
    }
}
