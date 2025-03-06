import java.util.*;
public class UnsortedAndReturnSortedInDecending{

  public static int[] unsortedAndReturnSortedInDecending(int[] array1, int[] array2){
	  
	  int[] concatenate = new int[array1.length + array2.length];
	  
	  for(int counter = 0; counter < array1.length; counter++){
		  concatenate[counter] = array1[counter];
	  }
	  
	  for(int counter = 0; counter < array2.length; counter++){
		  concatenate[array1.length + counter] = array2[counter];
	  }
	  
	  
	  int[] sorted = new int[concatenate.length];
	  
	  for(int outerCounter = 0; outerCounter < concatenate.length; outerCounter++){		  
		  int largest = concatenate[0];
		  int temp = 0;		  
		  for(int innerCounter = 0; innerCounter < concatenate.length; innerCounter++){
			  if(concatenate[innerCounter] > largest){
				  largest = concatenate[innerCounter];
				  temp = innerCounter;
			  }
		  }
		 sorted[outerCounter] = largest;
         concatenate[temp] = Integer.MIN_VALUE;		 
	  }
	  return sorted;
  }


public static void main(String[] args){
	int[] array1 = {3, 1, 5};
	int[] array2 = {8, 6, 4};
	
	int[] result = unsortedAndReturnSortedInDecending(array1, array2);
	System.out.println(Arrays.toString(result));
}
}