

import java.util.*;

class Program52{
	public static void main(String[] args)
	{
	
		for(int iCnt=1;iCnt<=5;iCnt++)
		{
			for(int jCnt=1;jCnt<=5;jCnt++)
			{
			if(jCnt>=iCnt)
			{
			
				System.out.print("*\t");
			}
			else{
			System.out.print("- \t");
			}
			}
			System.out.println("");
		}
			
	}
	
}
				
