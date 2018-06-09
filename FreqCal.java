import java.util.*;
class FreqCal{
	public static void main(String args[])
	{
	  Scanner num=new Scanner(System.in);
	  int a[]= new int[10];int b=0;
        Random r=new Random();

      for(int x=0;x<a.length;x++)
      	{     b=r.nextInt(10);
                  System.out.print(b+" ");
                  a[b]++;
      	}
       
      System.out.printf("\n");

      for(int i=0;i<a.length;i++)
      { System.out.println("The number of "+i+"'s are "+a[i]);
      }
	}
}