import java.util.*;
public class ConvertEvenNumberToZeroAndOddNumberToOne{

  public static int[] convertEvenNumberToZeroAndOddNumberToOne(int[] numbers){
	  
	
	  int k = 0;
	  
	  for(int count = 0; count < numbers.length; count++){
		  
		  if(numbers[count] % 2 == 0){
			  
			  numbers[count] = 0;
			  
		  }else{
			 numbers[count] = 1; 
		  }
		  
	  }
	  return numbers;
  }
  
  
  public static void main(String[] args){
	int[] numbers = {1, 2, 3, 4, 5};  
	
	int[] result = convertEvenNumberToZeroAndOddNumberToOne(numbers);
	
	System.out.println(Arrays.toString(result));
  }
}