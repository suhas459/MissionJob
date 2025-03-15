package firstPackage;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Temporary {
    public static void main(String[] args) {
        // Given array
        int[] arr = {4, 5, 6, 7, 4, 5, 8, 9, 4, 6, 10};
//        Set<Integer> set = new HashSet<>();
//        for(int temp:arr) {
//        	set.add(temp);
//        }
//        int pos=0;
//        Iterator<Integer> itr = set.iterator();
//        while(itr.hasNext()) {
//        	int count =0;
//        	for(int j =0;j<arr.length;j++) {
//        		if(itr.equals(arr[j])){
//        			System.out.println(itr+ "times"+j);
//        		}
//        	}
//        }
        //iterate over set
//        Set<String> set = new HashSet<>();
//        set.add("rishi");
//        set.add("is");
//        set.add("me");
//        Iterator<String> itr = set.iterator();
//        while(itr.hasNext()) {
//        	System.out.println(itr.next());
//        }
        
        // We will iterate through the array and manually track the count and positions of each element
        int[] visited = new int[arr.length];  // To track if we've already handled an element

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If this element has already been processed (its count is 1), skip it
            if (visited[i] == 1) {
                continue;
            }
            
            int element = arr[i];
            int count = 0;
            StringBuilder positions = new StringBuilder();
            
            // Now, we need to find all occurrences of the current element
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == element) {
                    count++;
                    positions.append(j).append(", ");
                    visited[j] = 1; // Mark this index as visited
                }
            }
            
            // Print the result only if the element is repeated more than once
            if (count > 1) {
                // Remove the last comma and space from the positions string
                positions.setLength(positions.length() - 2);
                System.out.println("Element " + element + " is repeated " + count + " times at positions [" + positions + "]");
            }
        }
    }
}
