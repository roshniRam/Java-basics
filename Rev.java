import java.util.Scanner;
class Rev{
	public static void main(String args[]){
		Scanner num=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter 5 array elements");
    for(int i=0;i<a.length;i++)
	a[i]=num.nextInt();

	int temp;
	for(int i=0;i<a.length/2;i++)
	{
      temp=a[i];
      a[i]=a[a.length-i-1];
      a[a.length-i-1]=temp;
	}
	System.out.println("After Reversing");
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	}
}