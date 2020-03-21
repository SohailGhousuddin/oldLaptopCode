import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
public class CustomHashMap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Key k1 = new Key("abc");
		Key k2 = new Key("abc");
		Key k3 = new Key("xyz");
		Node n1 = new Node(10,null);
		Node n2 = new Node(20,null);
		
		HashMap<Key,String> hms = new HashMap<Key,String>();
		HashMap<Key,Node> hsm2 = new HashMap<Key,Node>();
		
		HashSet<Key> hSet = new HashSet<Key>();
		//hSet.add(k1);
		
		hSet.add(k3);
		hSet.add(k2);
		TreeMap<Key,Node> hTree= new TreeMap<Key,Node>();
		
		hTree.put(k1, n1);
		hTree.put(k3, n2);
		//hTree.put(k2, n1);
		hsm2.put(k1, n1);
		hsm2.put(k3,n2);
		hms.put(k1, "try abc");
		System.out.println(hms.get(k2));
		hms.put(k2,"try again abc");
		hms.put(k3,"try xyz");
		
		for(Key k:hSet)
		{
			System.out.println("Key is:" +k.toString());
		}
		
		for(Map.Entry m:hms.entrySet())
		{
			 System.out.println("Frequency of " + m.getKey() + 
                     " is " + m.getValue());
		}
		
		for(Map.Entry m1:hsm2.entrySet())
		{
			System.out.println("value of key is:" +m1.getKey() + " Value is : "+ m1.getValue());
		}
		
		for(Map.Entry m3:hTree.entrySet())
		{
			System.out.println("Value of Ky: "+m3.getKey() + " Value from Tree is: " +m3.getValue());
		}

	}
	
	
	
	
	

}
