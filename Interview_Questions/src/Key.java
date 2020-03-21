
public class Key implements Comparable<Key>{
	
	
	private String theStringValue;

	Key(String str)
	{
		this.theStringValue = str;
		
	}
	@Override
	public String toString() {
		return theStringValue ;
	}


	
	@Override
	public int hashCode()
	{
	    return theStringValue.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
	    return this.toString().equals(o.toString());
	}
	@Override
	public int compareTo(Key arg0) {
		if(this.toString().equals(arg0.toString()))
		{
			return 0;
		}
		else
			return -1;
	
	}
}
