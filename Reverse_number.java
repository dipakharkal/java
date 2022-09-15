// Name : Dipak Ganpat Harkal ; Batch JAVA C-2533 //

/*2. Program to print reverse a number? 
For example , if the number is 9835 , then O/P should be 5389*/

public class Reverse_number {

	public static void main(String[] args) {
	
		//here I am initializing integer num == 9835 // value is given.
		
		 int num = 9835, rev = 0;
		// this output statement is printing "Original Number : 9835 " as we initilized it by num = 9835.   
		    System.out.println("Original Number: " + num);

		// here we check run until num becomes 0. 
		    
		    while(num != 0) {
		    
		// after that we will get last digit from num.
		 
		// this "num" variable is for preparing logic behind reversing a number
		
		      int num2 = num % 10;
		      rev = rev * 10 + num2;

		// remove the last digit from num
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + rev);
	}

}
