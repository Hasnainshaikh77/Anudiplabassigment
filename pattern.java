package labsession3;
import java.util.*;
//drawing a pattern L
public class pattern {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=scan.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i>=0&&i<n-1&&j==0||i==n-1&&j>0)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
	}

}
