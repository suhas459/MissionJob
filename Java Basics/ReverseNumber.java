package firstPackage;

public class ReverseNumber {
public static void main(String[] args) {
	int number  = 178683;
	int num=0;
	while(number !=0) {
		int temp = number%10;
		num = temp+num*10;
		number /= 10;
	}
	System.out.println(num);
}
}
