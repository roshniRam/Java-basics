class Split{
	public static void main(String args[]){
		String s="3.5, 12.9, 18.7, 121.54";
		String a[]=s.split(",");
		double b[]=new double[a.length];
		for(int i=0;i<a.length;i++)
			b[i]=Double.parseDouble(a[i]);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}