class BubbleSort{
	public static void main(String args[]){
	 String a[]={"Roshni","Rohit","Mayank","Vaaibhavi","Sandhya","Kirtika","Pritha","Anshuman","Avtans","Dipansh"};
	 String temp=null;
	 for(int j=0;j<a.length-1;j++)
	 {  for(int i=0;i<a.length-1;i++)
	 	   if(a[i].compareTo(a[i+1])>0 )
	 	    {
               temp=a[i];
               a[i]=a[i+1];
               a[i+1]=temp;
	 	    }
	 }
	 for(int i=0;i<a.length;i++)
	 	System.out.println(a[i]);
	}
}