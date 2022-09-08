// Name : Dipak Ganpat Harkal ; Batch JAVA C-2533 //

/*Write a java code to cover all types of operators?*/

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// initialise program variables here , This variables are used in all over the program
		
		//assignment operator
		// here = operator assign values to variables
		int a=10,b=5,c=3,max;
		
		// Here Arithematic Operators //
		
		System.out.println("Defaults values of Variables a = 10 , b = 5 and c = 3");
		System.out.println("addition of a + b is" + (a+b));
		System.out.println("Substraction of a - b is " + (a-b));
		System.out.println("multiplication of a * b is " + (a*b));
		System.out.println("division of a/b is " +(a/b));
		System.out.println("Reminder of a%c is " + (a%c));
		
//----------------------------------------------------------------//
        // here Unary operators
		
	    int r1, r2;

	    // assigned original value before increment
	    System.out.println("before increment: " + a);

	    // increment operator
	    r1 = ++a;
	    System.out.println("value after increment: " + r1);
	    
	    // assigned original value before decrement.
	    System.out.println("before decrement : " + b);

	    // decrement operator
	    r2 = --b;
	    System.out.println("After decrement : " + r2);
	  //----------------------------------------------------------------//

	//LOGICAL OPERATORS
	
	    //  && operator
	    System.out.println("statements is ((a > b) && (c > b))" + ((a > b) && (c > b)));  // false
	    System.out.println((b > a) && (b < a));  // false

	    //  || operator
	    System.out.println("statement is (c < c) || (a > a)" + ((c < c) || (a > a)));  // false
	    System.out.println("statement is (a > b) || (c < b)" + ((a > b) || (c < b)));  // true
	    System.out.println("statement is (b < a) || (b < c)" + ((b < a) || (b < c)));  // true
//
	    // ! operator
	    System.out.println(!(c == a));  // True
	    System.out.println(!(a > b));  // false
		  //----------------------------------------------------------------//
  // relational operator
	    
	    // == operator
	    System.out.println(a == b);  // false

	    // != operator
	    System.out.println(a != b);  // true

	    // > operator
	    System.out.println(a > b);  // true

	    // < operator
	    System.out.println(a < b);  // false

	    // >= operator
	    System.out.println(a >= b);  // true

	    // <= operator
	    System.out.println(a <= b);  // false
	    
		  //----------------------------------------------------------------//
	    	//Ternary operator
 
        // Largest among a and b
        max = (a > b) ? a : b;
 
        // Print the largest number
        System.out.println("Maximum is = " + max);
		  //----------------------------------------------------------------//

	}

}
