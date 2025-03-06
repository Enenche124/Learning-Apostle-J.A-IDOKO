public class Learning{

 public static void main(String[] args){
	  String letters = "abcdef";
	  char ch = 'd';
	  String expected = "";
	  int index = 0;
	  
	  for(int i = 0; i < letters.length(); i++){
        if(letters.charAt(i) != ch){
	  index ++;
  }		  else { break; }
	  }


for(int i = index; i >= 0; i--){
	expected += letters.charAt(i);
}  

for(int i = index + 1; i < letters.length(); i++){
	expected += letters.charAt(i);
}
System.out.println(expected);
  }


}