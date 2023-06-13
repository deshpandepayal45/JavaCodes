//find a number is in hexadecimal form or nnot
class Program20{
	public static void main(String[] args)
	{
		
		
		String str=new String("1573AB");
		
		
		if(str.matches("[0-9A-F]+")==true){
		System.out.println("given number is in hexadecimal format");
		}
		else{
		System.out.println("given number is not in hexadecimal format");
		}
	}
}
