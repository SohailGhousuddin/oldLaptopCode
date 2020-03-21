import java.util.Scanner;

public class App{
	public static void main (String[]  args)
	{
		Runner r1 = new Runner("1");
		r1.start();
		r1.setStopThread(true);
		
		Runner r2 = new Runner("2");
		r2.start();
		r2.setStopThread(true);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print enter to exit");
		sc.nextLine();
		r1.setStopThread(false);
		r2.setStopThread(false) ;
	}
}