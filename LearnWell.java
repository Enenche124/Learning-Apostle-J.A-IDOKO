public class LearnWell{

  public static String findCheck(String letters, char check){
  
    int index = 0;
	String expected = "";
    for(int i = 0; i < letters.length(); i++){
		
		if(letters.charAt(i) != check){
			index++;
		}else{
			break;
		}
	}
	
	for(int i = index; i >= 0; i--){
		expected += letters.charAt(i);
	}
	
	for(int i = index + 1; i < letters.length(); i++){
		expected += letters.charAt(i);
	}
	return expected;
  }



public static void main(String[] args){
	
	String letters = "abcdef";
	char check = 'd';
	System.out.println(findCheck(letters,check));
}
}