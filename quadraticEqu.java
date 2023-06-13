import java.util.*;
class Program9{
	public static void main(String args[])
	{
		int a=0,b=0,c=0;
		double r1=0,r2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter all values of quadratic equation");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		double common=0;
		common=Math.sqrt(b*b-4*a*c);
		r1=-(b+common)/(2*a);
		r2=-(b-common)/(2*a);
		
		System.out.println("first root: "+r1);
		System.out.println("second root: "+r2);
	}
}
		
