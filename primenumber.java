package labsession3;
//Java program to Find the Prime Numbers 100 to 200
public class primenumber {

	public static void main(String... args) {
		//Declaring variables
		 int  i, j, num;
		 int a=101;
		 int b=199;
		System.out.printf("prime number are", a,b);//after Find prime number output
		for (i= a; i <= b; i++) {
			if(i==1 || i==0)//skip 0 and 1 as the are neither prime nor composite
				continue;
			num=1;//num variable to tell if i is prime or not
			for(j = 2; j <=i/2; ++j){
				if(i % j == 0) {
					num = 0;
					break;
				}
			}
			if(num == 1)
				System.out.println(i);
		}
		
		
  
	}

}
