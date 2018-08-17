package Day1;

import java.util.Arrays;

public class largestValueinArray {

	public static void main(String[] args) {
		
		int i [] = { 10 , 33, 4, 56 } ;
		
		
		int largest=  i[0];
		
		int smallest= i [0] ;
		
		for (int a = 1 ; a <= i.length ; a++) {
			
			if (i[a] > largest ) {
				largest = i [a] ;
			}
			else  if (i[a]< smallest) {
				 smallest = i[a] ;
			 }
			
			System.out.println(Arrays.toString(i));
			
			System.out.println(largest);
			System.out.println(smallest);
		} 
		
		
		
		

	}

}
