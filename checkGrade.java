//grades for given marks
import java.util.*;

class Program24{
	public static void main(String[] args)
	{
		
		
		int iMark=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks");
		iMark=sc.nextInt();
		
		if(iMark>=85&&iMark<=100)
		{
			System.out.println("Grade is : A\n");
		}
		else if(iMark>=65&&iMark<=84){
			System.out.println("Grade is : B \n");
		}
		else if(iMark>=50&&iMark<=64){
			System.out.println("Grade is : c \n");
		}
		else if(iMark>=35&&iMark<=49){
			System.out.println("Grade is : d \n");
		}
		else{
			System.out.println("Grade is : fail \n");
		}
	}
}
