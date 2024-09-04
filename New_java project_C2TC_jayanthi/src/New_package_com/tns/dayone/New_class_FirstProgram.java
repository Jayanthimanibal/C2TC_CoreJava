/**
 * 
 */
package New_package_com.tns.dayone;

/**
 * 
 */
public class New_class_FirstProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int num1 = 20;
		        int num2 = 10;

		        // Addition
		        int sum = num1 + num2;
		        System.out.println("Sum: " + sum);

		        // Subtraction
		        int difference = num1 - num2;
		        System.out.println("Difference: " + difference);

		        // Multiplication
		        int product = num1 * num2;
		        System.out.println("Product: " + product);

		        // Division
		        int quotient = num1 / num2;
		        System.out.println("Quotient: " + quotient);

		        // Modulus
		        int remainder = num1 % num2;
		        System.out.println("Remainder: " + remainder);
		        int a=10, b=50;
		        a++; // Post-increment
		        System.out.println("post-increment: " + a);
		        ++a; // Pre-increment
		        System.out.println("pre-increment: " + a);

		        // Decrement operations
		        
		        b--; // Post-decrement
		        System.out.println("post-decrement: " + b);
		        --b; // Pre-decrement
		        System.out.println("pre-decrement: " + b);
		        
		        //Relational Operators
		        
		        System.out.println("a == b: " + (a == b));  // Equal to
		        System.out.println("a != b: " + (a != b));  // Not equal to
		        System.out.println("a > b: " + (a > b));    // Greater than
		        System.out.println("a < b: " + (a < b));    // Less than
		        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
		        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
		        
		        //Assignment Operators
		        //'+='means a=a+3
		        a += 3;
		        System.out.println(a);

		        //'-=' means a=a-3
		        a -= 3;
		        System.out.println(a);

		        //'*=' means a=a*3
		        a *= 3;
		        System.out.println(a);

		        
		        //Ternary Operator(condition? true : false)
		        
		        int max = (a > b) ? a : b;

		        System.out.println("maximum num: " + max);


		    }
		


	}


