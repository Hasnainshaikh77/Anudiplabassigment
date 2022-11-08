package labsession3;

public class tryandcatch {
//here i am create a try and catch superclass and try and catch subclass	

	public static void main(String[] args) {
		System.out.println("Hasnain");
		try {//creating a superclass of try and catch
//		if Exception occurs in the super class the remaining statement will not be exceute	
			int data=34/0;
			 try { //creating a subclass of try and catch
				 int data1=34/2;
			 }
			 catch(ArithmeticException e){//handling the Exception in subclass
				 System.out.println("subclass Exception");
			 }
		}
		catch(Exception e){//handling the Exception in superclass
			System.out.println("superclass Exception");
		}
//		output :
	}
	

}
