//finding maximum number using varargs
import java.util.*;
class Program78{
	static int max(int ...x)
	{
		if(x.length==0)
			return 0;
		int iCnt=0;
		int max=Integer.MIN_VALUE;
		for(iCnt=0;iCnt<x.length;iCnt++){
		if(max<x[iCnt])
			max=x[iCnt];
		}return max;
		
	}
	public static void main(String[] args)
	{
		System.out.println(max(10,20,30,40,50));
	}
}
