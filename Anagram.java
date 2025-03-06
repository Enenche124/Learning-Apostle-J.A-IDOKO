public class Factor{

	public static int getFactor(int factor){
		
int counter = 0;

for(int i = 1; i <= factor; i++){

if(factor % i == 0)counter++;

 }
return counter;

	}
	public static void main(String[] args){
		int factor = 3;
		System.out.println(getFactor(factor));
	}
}