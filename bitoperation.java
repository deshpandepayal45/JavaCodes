class Program11{
	public static void main(String args[])
	{
		int a=12,b=9;
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println(a+" "+b);
	}
}
