package labAssigment7;

public class thread extends Thread {

    //This is one thread
    public void run()
    {
        //this code for find average of 50 numbers.
        int n=50;
        int sum=0;
        //using for loop find the sum of 50 numbers
        for(int i=1;i<=50;i++)
        {
            sum+=i;
        }
        //This is formula to find average of 50 numbers
        int average = sum/n;

        System.out.println("Average of 50 numbers :"+average);
    }
    public static void main(String[] args) {

        //create object of thread class
        thread obj=new thread();

        //call method of Thread class
        obj.start(); 


        //This code for find square of given array elements
        int[] array= {10,15,20,25,30};
        int square=0;
        for(int i=0;i<array.length;i++)
        {
            square=(int)Math.pow(array[i], 2);

            System.out.println(array[i]+" "+square);
        }
    }
}