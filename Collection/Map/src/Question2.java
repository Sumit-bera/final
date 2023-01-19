import java.util.*;
import java.util.Map.Entry;
class Contacts{
	static TreeMap<String,Long>contactList=new TreeMap<String,Long>();
	public void addContacts(String name,long number) {
		contactList.put(name, number);
		
	}
	
	public long getphone(String name) {
		long n=0;
		if(contactList.containsKey(name))
			n=contactList.get(name);
	return n;
	}
	
	public String getName(long phone) {
		Set<Entry<String,Long>> set= contactList.entrySet();
		Iterator<Entry<String,Long>> it=set.iterator();
		while(it.hasNext()) {
			Entry<String,Long> e=it.next();
			if(e.getValue()==phone)
				return e.getKey();
		}
		return null;
		
	}
	
	public void printAll() {
		Set<Entry<String,Long>> s=contactList.entrySet();
		Iterator<Entry<String,Long>> it=s.iterator();
		while(it.hasNext()) {
			Entry<String,Long> e=it.next();
			System.out.println(e);
		}
	}
	
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacts c=new Contacts();
		c.addContacts("Amit", 98675557);
		c.addContacts("Ankit", 6767678);
		c.addContacts("Arvind", 6767733);
		c.addContacts("Rahul", 563663334);
		
		System.out.println(c.getName(98675557));
		System.out.println(c.getphone("Rahul"));
		c.printAll();
		
	}

}
