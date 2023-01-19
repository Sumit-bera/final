import java.util.*;
public class HashSetDemo {
static HashSet<String> set=new HashSet<>();
	
	boolean addCountry(String countryName) {
		return set.add(countryName);
	}
	
	String findCountry(String countryName) {
		if(set.contains(countryName))
			return countryName;
		else
			return "Country Not Found";
	}
	
	void printAllCountries() {
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String args[]) {

		HashSetDemo obj = new HashSetDemo();
		
		obj.addCountry("India");
		obj.addCountry("Australia");
		obj.printAllCountries();
		
	}
	
}
