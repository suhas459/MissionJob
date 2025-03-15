

import java.util.Scanner;

public class Inheritance {
static void Run() {
	System.out.println("I am inside class inheritance");
}
public static void main(String[] args) {
//String str = "DELL";
//StringBuilder sb = new StringBuilder();
//Set<Character> set = new HashSet<>();
//char[] charArray = str.toCharArray();
//for(char temp: charArray) {
//	if(set.add(temp) != false) {
//		sb.append(temp);
//	}
//}
//System.out.println(sb);
//	Set<String> set = new HashSet<>();
//	set.add("Saima");
//	set.add("rishi");
//	set.add("mukul");
//	for(String s:set) {
//		System.out.println(s);
//	}
	
	String str = "I am back";
	String reversed = "";
	for(int i =str.length()-1; i>=0;i--) {
		reversed += str.charAt(i);
	}
	System.out.println(reversed);
	Scanner s = new Scanner(System.in);
	String str1 = s.next();
	String rev1 ="";
	for(int i = str1.length()-1;i>=0;i--) {
		rev1 += str1.charAt(i);
	}
	if(str1.equals(rev1))
		System.out.println("string is palindrome");
	else
		System.out.println("string is not palindrome");
}
}
