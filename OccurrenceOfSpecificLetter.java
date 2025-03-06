public class OccurrenceOfSpecificLetter{

  public static int findOccurrenceOfSpecificLetter(String word, char letter){
	int counter = 0;
	word = word.toLowerCase();
        letter = Character.toLowerCase(letter);
	for(int count = 0; count < word.length(); count++){
		if(word.charAt(count) == letter){
			counter = counter + 1;
		}
	}
	return counter;
  }


public static void main(String[] args){
	
	String word = "OpenAI";
	char letter = 'a';
	
	int result = findOccurrenceOfSpecificLetter(word, letter);
	System.out.println(result);
}
}