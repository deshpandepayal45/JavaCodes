class Program14{
	public static void main(String args[])
	{
		String str="Java Programs";
		
		System.out.println("Length of String :"+str.length());
		
		String str2=str.toLowerCase();
		System.out.println("String is in lowercase :"+str2);
		
		String str3=str.toUpperCase();
		System.out.println("string is in uppercase :"+str3);
		
		String str4=str.substring(3);
		System.out.println("substring from 3 index :"+str4);
		
		String str5=str.substring(3,8);
		System.out.println("substring from 3 index to 8 index :"+str5);
		
		String str6=str.replace('P','G');
		System.out.println("character is replaced with g :"+str6);
		
		System.out.println("Actual string :"+str);
		
	
		System.out.println("character present at 3 index :"+str.charAt(3));
		
		
		System.out.println("is string start with Programs :"+str.startsWith("Programs"));
		
		
		System.out.println("is string end with Programs :"+str.endsWith("Programs"));
		
		
		System.out.println("index of gr :"+str.indexOf("gr"));
		
		System.out.println("Last index of a :"+str.lastIndexOf("a"));
		
		
	
		
		
	}
}
