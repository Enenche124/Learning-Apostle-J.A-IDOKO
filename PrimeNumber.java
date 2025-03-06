public class PrimeNumber{
   public static boolean primeNumber(int prime){
	   int counter = 0;
	   for(int i = 1; i <= prime; i++){
		   if(prime % i == 0){
			   counter++;
		   }
		   
	   }
	   if(counter > 2){
		   return false;
   }else{
	   return true;
   }
   }
   
   public static void main(String[] args){
	   int prime = 9;
	   
	   System.out.println(primeNumber(prime));
	   
   }
}