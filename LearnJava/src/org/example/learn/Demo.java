package org.example.learn;

public class Demo {

	public static void main(String[] args) {
	
		int[] elements = {2,3,4,100,54,34,76,-2};
		int indexPos = 0;
		int sumTotal = 0;
		
		while(indexPos < elements.length){
			System.out.println("Processing: " + elements[indexPos]);
			
			if (elements[indexPos] < 0){
				System.out.println("Break!");
				break;
			}
			else if(elements[indexPos] > 99){
				System.out.println("Continue!");
				indexPos++;
				continue;
			}
			sumTotal = sumTotal + elements[indexPos];
			
			indexPos++;
		}
		
		System.out.println("Sum total was: " + sumTotal);
	}

}
