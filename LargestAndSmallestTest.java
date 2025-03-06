import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestAndSmallestTest{
	
	LargestAndSmallest minAndMax = new LargestAndSmallest();
	
	
	@Test
	public void testThatLargestComeBeforeSmallest(){
		int[] arr = {2, 90, 3, 1, 8, 7, 9};
		int[] actual = minAndMax.getLargestAndSmallest(arr);
		int[] result = {90, 1};
		
		assertArrayEquals(actual, result);
	}

}