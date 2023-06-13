class Program17{
	public static void main(String args[]){
		
		String str="acc";
		String str1="abcBdef";
		String str3="deshpande.payal02@gmail.com";
		
		System.out.println(str.matches(".*"));
		
		System.out.println(str.matches("[a-z]*"));
		
		System.out.println(str1.matches("[a-z]*"));
		
		System.out.println(str.matches("[abc]{3}"));
		
		System.out.println(str3.matches(".*gmail.*"));
		
		
	}
}
