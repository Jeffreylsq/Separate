package separate;

/*If we use bill $1 $2 $5 $20 to break up $100
 * How many combinations for this problems
 * 
 */


public class Demo {

	public static void main(String[] args) {
	
		int index = 0;

		 for(int i = 0 ; i <= 50 ; i++)
		 {
			 for(int j = 0 ; j <= 20; j++)
			 {
				 for(int z = 0 ; z <= 5 ; z++)
				 {
					 if(i*2 + j*5  <= 100)
					 {
						 index ++;
					 }
				 }
			 }
		 }
		 
		 System.out.println("Total possibles: " + index);
	}

}
