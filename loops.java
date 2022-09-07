
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=19;
		int b=17;
		
		// 1. simple if 
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
        System.out.println("b is greather");
		}
        // 2. if --- else
        
        if(a<b) {
        	System.out.println("a>b");
        }else {
        	System.out.println("a<b");
        }
        
        // 3.if ----else if 
        
        if(a<b) {
        	System.out.println("a>b");
        }
        else if(a<=b) {
        	System.out.println("a>=b");
        }
        else if(a==b) {
        	System.out.println("a==b");
        }
        else {
        	System.out.println("default");
        }
	}
}