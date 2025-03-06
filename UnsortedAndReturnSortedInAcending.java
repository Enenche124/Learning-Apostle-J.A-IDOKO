import java.util.*;
public class UnsortedAndReturnSortedInAcending{

  public static int[] unsortedAndReturnSortedInAcending(int[] list1, int[] list2){
	  int[] concat = new int[list1.length + list2.length];
	  for(int count = 0; count < list1.length; count++){
		  concat[count] = list1[count];
	  }
	  
	  for(int count = 0; count < list2.length; count++){
		  concat[list1.length + count] = list2[count];
	  }
	  
	  
	  int[] ascending = new int[concat.length];
	  for(int count = 0; count < concat.length; count++){
		int smallest = concat[0];
        int temp = 0;
        for(int counter = 0; counter < concat.length; counter++){
			if(concat[counter] < smallest){
				smallest = concat[counter];
				temp = counter;
			}
		}		
		 ascending[count] = smallest;
          concat[temp] = Integer.MAX_VALUE;		 
	  }
	  return ascending;
  }



public static void main(String[] args){
	int[] list1 = {9, 5, 0};
	int[] list2 = {3, 6, 10};
	
	int[] result = unsortedAndReturnSortedInAcending(list1, list2);
	System.out.println(Arrays.toString(result));
}
}