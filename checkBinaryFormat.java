//find a number is binary or not 

class Program19{
	public static void main(String args[])
	{
		int b=10010111;
		
		String str=new String();
		str.valueOf(b);
		
		if(str.matches("[01]+")==true){
		System.out.println("String is in binary formt");
		}
		else{
		System.out.println("String is not in binary format");
		}
	}
}
