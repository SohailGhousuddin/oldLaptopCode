import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	public void stageOne()
	{
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(new Random().nextInt(100));
		
	}
	public void stageTwo()
	{
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(new Random().nextInt(100));
		
	}
	public void process()
	{
	 for(int i=0;i<1000;i++)
	 {
		 stageOne();
		 stageTwo();
	 }
	}

	public  static void main(String[] args)
	{
		Worker w = new Worker();
		System.out.println("Starting...");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {
		
			@Override
			public void run() {
				// TODO Auto-generated method stub
				w.process();
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				w.process();
			}
		});
		t2.start();
		try {
			t1.join();
			t2.join();;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
	
		System.out.println("Time taken:" + (end - start));
		System.out.println("List 1:" +w.list1.size() +", List 2:"+ w.list2.size());
		
	}
}