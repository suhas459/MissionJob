
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostRepeatedCharacterUsingMap {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.next();
	s.close();
	char[] strArray = str.toCharArray();
	Map<Character,Integer> map = new HashMap<>();
	for(char c :strArray) {
		map.put(c, map.getOrDefault(c, 0)+1);
	}
	int max  = 0;
	char mostRepeatedChar = ' ';
	for(Map.Entry<Character, Integer> entry:map.entrySet()) {
		if(entry.getValue()>max) {
			max = entry.getValue();
			mostRepeatedChar = entry.getKey();
		}
	}
	System.out.println("most repeated character is"+mostRepeatedChar);
}
}
