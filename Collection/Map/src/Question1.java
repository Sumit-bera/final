import java.util.*;
import java.util.Map.Entry;
class Country{
	static HashMap<String,String>mapObj=new HashMap<String,String>();
	static HashMap<String,String>map1=new HashMap<String,String>();
	
	public String saveCountryCapital(String countryName,String capital){
		return mapObj.put(countryName,capital);
	}
	
	public String getCapital(String countryName) {
		
		String s1="";
		if(mapObj.containsKey(countryName)) {
			s1=mapObj.get(countryName);
		}
		return s1;	
	}
	
public String getCountry(String capital) {
		
	Set<Entry<String, String>> set = mapObj.entrySet();
	Iterator<Entry<String, String>> itr = set.iterator();
	
	while (itr.hasNext()) {
		Entry<String, String> e = itr.next();
		
		if (e.getValue().equals(capital))
			return e.getKey();
	}
	
	return null;	
	}

public HashMap<String, String> swapValue() {
	HashMap<String, String> M2 = new HashMap<String, String>();
	
	Set<Entry<String, String>> set = mapObj.entrySet();
	Iterator<Entry<String, String>> itr = set.iterator();
	
	while (itr.hasNext()) {
		Entry<String, String> e = itr.next();
		M2.put(e.getValue(), e.getKey());
	}
	
	return M2;
}
public ArrayList<String> toArrayList() {
	ArrayList<String> list = new ArrayList<>();
	
	Set<Entry<String, String>> set = mapObj.entrySet();
	Iterator<Entry<String, String>> itr = set.iterator();
	
	while (itr.hasNext()) {
		Entry<String, String> e = itr.next();
		list.add(e.getKey());
	}
	return list;
}
}
public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c=new Country();
		c.saveCountryCapital("India", "Delhi");
		c.saveCountryCapital("Iran", "Tehran");
		c.saveCountryCapital("Japan", "Tokyo");
		c.saveCountryCapital("Sri Lanka", "Colombo");
		
		System.out.println(c.getCapital("India"));
		System.out.println(c.getCountry("Colombo"));
		HashMap<String,String>m=c.swapValue();
		System.out.println(m);
		System.out.println(c.toArrayList());
		

	}

}
