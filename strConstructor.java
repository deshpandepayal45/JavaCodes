class Program13{
	public static void main(String args[])
	{
		String str1="Java Programs";
		String str2=new String("JAVA");      //here two objects are created 
							//one inside the heap and another on constant pool
							//after using new keyword there is no mandatory that 2 objects are always created 
							//if a object was present on pool then it is referenced by reference var.
		
		System.out.println(str1);
		System.out.println(str2);
		
		//String constructors
		//String(char c[])
		char c[]={'a','e','i','o','u'};
		String ch=new String(c);
		System.out.println(ch);
		
		//String(byte b[])
		byte b[]={65,66,67,68};
		String b1=new String(b);
		System.out.println(b1);
	
		
		
	}
}
