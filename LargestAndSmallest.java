import java.util.*;
public class LargestAndSmallest{

    public static int[] getLargestAndSmallest(int[] numbers){
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		//int smallest = numbers[0];
		//int largest  = numbers[1];
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] > largest)largest = numbers[count];
			if(numbers[count] < smallest)smallest = numbers[count];
		}
		return new int[]{largest, smallest};
	}



public static void main(String[] args){
	
	int[] numbers = {-2, -90,-3, -1, -8, -7, -9};
	int[] result = getLargestAndSmallest(numbers);
	System.out.println(Arrays.toString(result));
}
}