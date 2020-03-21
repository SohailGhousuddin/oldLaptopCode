import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args)
	{
		int[] A= {2,5,3};
		int sz= A.length;
	   Arrays.sort(A);
	   for(int a:A)
	   {
	   System.out.println(a);
	   }
	}

}
