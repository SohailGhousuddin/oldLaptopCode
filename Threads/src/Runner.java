
public class Runner extends Thread {
	Runner()
	{}
	Runner(String name)
	{
		super(name);
		setThreadName(name);
	}
private String ThreadName;
private boolean stopThread;
public boolean getStopThread() {
	return stopThread;
}
public void setStopThread(boolean stopThread) {
	this.stopThread = stopThread;
}
public String getThreadName() {
	return ThreadName;
}
public void setThreadName(String threadName) {
	
	ThreadName = threadName;
}
@Override
public void run() {
	int i  = 1;
	// TODO Auto-generated method stub
	System.out.println("From run");
	while(getStopThread())
	{
		i++;
		System.out.println("From Thread:"+getThreadName()+"RUN:"+i);
		try
		{
			Thread.sleep(10);
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
}



