

import java.util.HashSet;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
//		{4, 5, 6, 7, 4, 5, 8, 9, 4, 6, 10}
//		 
//		Element 4 is repeated 3 times at positions [0, 4, 8]
//		Element 5 is repeated 2 times at positions [1, 5]
//		Element 6 is repeated 2 times at positions [2, 9]
		int[] array = {4, 5, 6, 7, 4, 5, 8, 9, 4, 6, 10};
		int[] visited = new int[array.length];
		for(int i =0; i<array.length;i++) {
			if(visited[i]==1)
				continue;
			int count =0;
			int ele = array[i];
			StringBuilder sb = new StringBuilder();
			for(int j =i; j<array.length;j++) {
				if(ele == array[j]) {
				count++;
				visited[j] =1;
				sb.append(j).append(", ");}
			}
			
			if(count>1) {
//			sb.setLength(sb.length()-2);
			System.out.println(ele + "is repeated "+ count+ "times at positions "+sb);
			
		}
			}
	}
}
