// Name : Dipak Ganpat Harkal ; Batch JAVA C-2533 //

/*Write a java code input Student id,Sname, attendance and print
 * details using "Scanner Class"?*/
// here we import java.util.Scanner class for using input statement in program .
import java.util.Scanner; 

// here class name declare as student.
public class Student {

// here main function of the program
	public static void main(String[] args) {
		
		// program variable declare here 
		int  Stu_id;
		String Sname;
		String attendance;
		
		//scanner function with object sc for taking input in program
		Scanner sc= new Scanner(System.in);
		
		// Input statements for taking inputs form user 
	System.out.println("Enter your ID");	
	Stu_id=sc.nextInt();
	System.out.println("Enter your name");
	Sname=sc.next();
	System.out.println("Place attendance Present or Absent");
	attendance=sc.next();
	
// output statements , whatever user give the input this statemnents will print that on computer screen
	System.out.println("Student ID is :" + Stu_id);
	System.out.println("Sirname is : " + Sname);
	System.out.println(Sname + " is " +attendance);
		
	}
}

//output
/*
Enter your ID
10
Enter your name
dipak
Place attendance Present or Absent
present
Student ID is :10
Sirname is : dipak
dipak is present
*/