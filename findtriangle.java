package javalab;
import java.util.Scanner;

public class findtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kj = new Scanner(System.in);
        System.out.println("please enter first side: ");
        int num1 = kj.nextInt();
        
        System.out.println("please enter second side: ");
        int num2 = kj.nextInt();
        
        System.out.println("please enter third side: ");
        int num3 = kj.nextInt();
        if(num1==num2&&num1==num3) {
        	System.out.println("Acute triangle");
        }else if(num1<num2||num2==num3) {
        	System.out.println("Right Triangle");
        }else if(num1<num2||num2>num3) {
        	System.out.println("Obtuse Triangle");
        }
        else {
        	System.out.println("invalid input");
        }
       
        
        

	}

}
