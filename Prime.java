import java.util.Scanner;
class Prime{
	public static void main(String args[])
	  {
	    Scanner num =new Scanner(System.in);
      int i=0;
    	System.out.println("Enter any number");
    	int a=num.nextInt();
        if(a==2)
         {
           System.out.println("The number is prime");
         }
         else
         {
         for(i=2;i<a/2;i++)
          {
          if(a%i==0)
           {
           System.out.println("The number is not prime");
            break;
           }
          }
         }
         if(i==a/2)
         System.out.println("The given number is prime");
	  }
}