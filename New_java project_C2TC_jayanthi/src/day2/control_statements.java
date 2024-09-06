/**
 * 
 */
package New_package_com.ths.daytwo;

/**
 * 
 */
public class control_statements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i = 10;
		  
	        if (i < 15)
	            System.out.println("i is smaller than 15");
	        else
	            System.out.println("i is greater than 15");
	        //nested if statements
	        
	        if (i == 10 || i<15) 
	            // First if statement
	            if (i < 15)
	                System.out.println("i is smaller than 15");
	 
	            // Nested - if statement
	            // Will only be executed if statement above
	            // it is true
	            if (i < 12)
	                System.out.println(
	                    "i is smaller than 12 too");
	         else
	                System.out.println("i is greater than 15");
	            //switch statements
	            switch(i){
	            case 5 :  System.out.println("It is 5");
	                      break;
	            case 10 : System.out.println("It is 10");
	                      break;
	            case 15 : System.out.println("It is 15");
	                      break;
	            case 20 : System.out.println("It is 20");
	                      break;
	            default:  System.out.println("Not present");
	            }
	        
                //continue
	            for ( i=0 ; i < 50; i++) {
	                // If the number is even
	                // skip and continue
	                if (i % 2 == 0)
	                    continue;
	     
	                // If number is odd, print it
	                System.out.print(i + " ");
	            }
	}

}
