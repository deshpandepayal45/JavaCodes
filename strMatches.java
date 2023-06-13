class Program16{
	public static void main(String args[])
	{
		String str="m";
		String str1="gsuj3673&&";
		System.out.println(str.matches(".")); // . means any character ,number,special symbol
		
		System.out.println(str.matches(".")); 
		
		System.out.println(str.matches("[abc]")); // return true if any of the character present 
		
		System.out.println(str.matches("[^abc]")); //return true if any of character is not present
		
		System.out.println(str.matches("m")); //return true if exactly char present
		
		System.out.println(str.matches("a|m")); //return true if one of the character is present
		
	}
}
