import java.util.*;
class Program10{
	public static void main(String args[])
	{
		int iBreadth=0,iHeight=0,iLength=0;
		double dTotalArea=0,dVolume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the breadth of cuboid");
		iBreadth=sc.nextInt();
		System.out.println("Enter the height of cuboid");
		iHeight=sc.nextInt();
		System.out.println("Enter the length of cuboid");
		iLength=sc.nextInt();
		
		double dFrontSide=0,dBottomSide=0,dRightSide=0;
		dFrontSide=iLength*iHeight;
		
		dBottomSide=iBreadth*iLength;
		
		dRightSide=iHeight*iBreadth;
		
		dVolume=iBreadth*iLength*iHeight;
		
		dTotalArea=2*(iLength*iBreadth+iBreadth*iHeight+iHeight*iLength);
		
		System.out.println("Volume of cuboid : "+dVolume);
		System.out.println("total area of cuboid : "+dTotalArea);
		
	}
}
		
