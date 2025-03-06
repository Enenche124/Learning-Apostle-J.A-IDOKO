public class ReverseString{
  
  public static String reverseString(String letters){
	 
	  String expected = " ";
	  for(int count = letters.length() - 1; count >= 0; count--){
		  expected += letters.charAt(count);
	  }
	  return expected;
  }



public static void main(String[] args){
 String charcters = "ABCD";
 String result = reverseString(charcters);
 System.out.println(result);
}
}