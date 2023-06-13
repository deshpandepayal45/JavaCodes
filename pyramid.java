class Program15{
	public static void main(String args[])
	{
		String str1="Pyramid";
		String str2="Pyramid";      
		String str3="pYraMid";
		String str4=new String("Pyramid");
		
		
		
		System.out.println(str1.equals(str4));
		
		System.out.println(str1==str4); //str1 creates object in pool and str 4 creates object in heal..so its false

		System.out.println(str1==str2); //it return true beacause both refernces pointing on same object which was created inside pool 	
		
		System.out.println(str1.equalsIgnoreCase(str3));  
		
		System.out.println(str1.compareTo(str3)); // returns negative int . coz alphabetically(ascii code) first string is smaller then second 

		System.out.println(str1.compareTo(str2)); //returns 0 . coz both strings are equal
		
		System.out.println(str3.compareTo(str1)); //return positive int.bcoz first string is greater than second
		
		System.out.println(str1.valueOf(65));
		
	}
}
