

import java.util.Scanner;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
		System.out.println("welcome to number guessing game!!");
		Scanner s = new Scanner(System.in);
		System.out.println("do you wanna play this game? ");
		String user_input = s.next();
		String answer ;
		int counter =0;
		if(user_input.toLowerCase().equals("yes")) {
			System.out.println("what is fullform for UPSC? ");
			answer = s.next();
			if(answer.toLowerCase().equals("union public service commision")) {
				System.out.println("Correct!");
				counter++;
			}else System.out.println("Incorrect!");
			System.out.println("what type of language javascript is?  ");
			answer = s.next();
			if(answer.toLowerCase().equals("loosely typed")) {
				System.out.println("Correct!");
				counter++;
			}else System.out.println("Incorrect!");
			System.out.println("where noida is located? ");
			answer = s.next();
			if(answer.toLowerCase().equals("uttar pradesh")) {
				System.out.println("Correct!");
				counter++;
			}else System.out.println("Incorrect!");
		}
		else
			System.exit(0);
	}

}
