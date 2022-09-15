// Name : Dipak Ganpat Harkal ; Batch JAVA C-2533 //
//1) Program to find the largest of 03 numbers?

//here we are importing Java Scanner library which is neccesory for using Scanner class.
import java.util.Scanner;

//this is public class "Largestnumber" also our file name.
public class Largestnumber {  

	//this is  main class.
	public static void main(String[] args) {
	
		//here we are initializing three variables.which will going to store three user input values.
		int num1,num2,num3;
		
		//here is our Scanner class which is used to take input from user.
		// here in Scanner class "input" is a object.
		 Scanner input = new Scanner(System.in); {
			 
		//this output statement ask user to input first number.
			 System.out.println("enter first number :");
		//here this statement stores user input first number in "num1" variable.
	   		 num1 = input.nextInt();
	   		 
	   	//this output statement ask user to input second number.
			 System.out.println("Enter second number :");
		//here this statement stores user input second number in "num2" variable.
			 num2 = input.nextInt();
			 
		//this output statement ask user to input third number.
			 System.out.println("Enter third number :");
		//here this statement stores user input third number in "num3" variable.
			 num3 = input.nextInt();
		}
		 
		 //here i am compairing the user input values for selecting/getting largest number.
		 /*in this "if statement" we are compainring num1 with num2 and num3 ,
		  * we use logical && in between this two conditions so if both is satisfy
		  * means if num1 is greather than num2 and num3 then it will print num1 value
		  * otherwise check for futher.
		  */
		 if( num1 >= num2 && num1 >= num3)
	            System.out.println(num1 + " is the largest number.");

		 //again same here for num2/ here we are checking same with num2 and num3.
	        else if (num2 >= num1 && num2 >= num3)
	            System.out.println(num2 + " is the largest number.");
		 
		 //if above condition not satify them last number num3 will print.
	        else
	            System.out.println(num3 + " is the largest number.");
	}

}
