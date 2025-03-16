package StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCountInString {
    public static void main(String[] args) {
        System.out.println("Enter Y or y if you wanna use inbuilt methods else enter N");
        Scanner sc = new Scanner((System.in));
        char in = sc.next().charAt(0);
        System.out.println("Plaese enter any string");
        String str = sc.next();
        
        sc.close();
        if(in == 'Y' || in == 'y'){
            Map<Character, Integer> map = new HashMap<>();
            char[] charArray =  str.toCharArray();
            for(char temp :charArray){
                map.put(temp,map.getOrDefault(temp, 0)+1);
            }
            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                System.out.println(entry);
            }
        }else{

        }

    }
}
