class Program18{
	public static void main(String args[]){
	
	String str="programmer@gmail.com";
	int i;
	i=str.indexOf("@");
	
	String domain=new String(str.substring(0,i));
	String codomain=new String(str.substring(i,str.length()));
	
	System.out.println("domain is :"+domain);
	System.out.println("Co-domain is :"+codomain);
	
	boolean b=false;
	b=codomain.startsWith("@gmail");
	
	if(b==true)
	{
		System.out.println("given string is in perfect mail format ");
	}
	else{
		System.out.println("given string is not  in perfect mail format ");
	}
	}
}
