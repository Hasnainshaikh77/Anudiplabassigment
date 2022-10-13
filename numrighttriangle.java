package javalab;

import java.util.Scanner;

public class numrighttriangle {
	Scanner k=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		   System.out.print("Input number of rows : ");
		 Scanner k = new Scanner(System.in);
				    n = k.nextInt();

		   for(i=1;i<=n;i++)
		   {
			for(j=1;j<=i;j++)
			  System.out.print(j);

		    System.out.println("");
		    }

	}

}
