import java.util.*;
class Program8{
	public static void main(String args[])
	{
		float iSide1=0,iSide2=0,iSide3=0;
		double fArea=0,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter all sides of traingle");
		iSide1=sc.nextFloat();
		iSide2=sc.nextFloat();
		iSide3=sc.nextFloat();
		
		s=(iSide1+iSide2+iSide3)/2f;
		fArea=Math.sqrt(s*(s-iSide1)*(s-iSide2)*(s-iSide3));
		System.out.println("Area of traingle: "+fArea);
	}
}
		
