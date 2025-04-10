

import java.util.Arrays;

public class moveNonZeroToEnd {

	public static void main(String[] args) {
		

		
		        int[] a = {1, -5, 0, 0, 8, 0, 1};

		        int index = 0; // Position to place the non-zero element
		        
		        // Move non-zero elements forward
		        for (int num : a) {
		            if (num != 0) {
		                a[index++] = num;
		            }
		        }
		        
		        // Fill the remaining positions with zeros
		        while (index < a.length) {
		            a[index++] = 0;
		        }

		        // Print the result
		        System.out.println(Arrays.toString(a));
		


	}

}
