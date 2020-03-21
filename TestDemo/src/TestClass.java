
public class TestClass {
	
	public static void main(String[] args)
	{
		System.out.println("Testing");
	System.out.println(mergeString("abcd","uvwxyz"));
	System.out.println(mergeString("abc","defg"));
	System.out.println(mergeString("zbxnsjdns","idowdk"));
	System.out.println(mergeString("idowdk","abc"));
	}
public static String mergeString(String a, String b)
{
	String res="";
	int s1Len = a.length();

	int s2Len=b.length();
	int loop=s1Len>s2Len?s1Len:s2Len;
	
	int j=0;
	
	for(int i =0; i<loop;i++)
	{
		
		if(i<s1Len && i<s2Len)
		{
			j=i;
		res =res+ a.charAt(i)+b.charAt(i);
		}
	}
	
	if(s1Len>s2Len)
		res=res+a.substring(j+1);
			//System.out.println("s1len"+a.substring(i));
		if(s2Len>s1Len)
			res=res+b.substring(j+1);
	
	
	
	return res;
	
}
}
