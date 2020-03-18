import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> countrySet = new HashSet<String>();
		countrySet.add("Nepal");
		countrySet.add("China");
		countrySet.add("USA");
		countrySet.add("Japan");
		countrySet.add("Nepal");
		
		System.out.println("Hashed Set:");
		Iterator<String> itr = countrySet.iterator();
		while(itr.hasNext()) {
			String country = itr.next();
			System.out.println(country);
		}
		System.out.println();
		Set<String> countrySet1 = new LinkedHashSet<String>();
		countrySet1.add("Nepal");
		countrySet1.add("China");
		countrySet1.add("USA");
		countrySet1.add("Japan");
		countrySet1.add("Nepal");

		System.out.println("LinkedHashed Set:");
		for (String country : countrySet1) {
			System.out.println(country);
		}
		System.out.println();
		
		Set<String> countrySet2 = new TreeSet<String>(new SortByAlphabet());
		countrySet2.add("Nepal");
		countrySet2.add("China");
		countrySet2.add("USA");
		countrySet2.add("Japan");
		countrySet2.add("Nepal");
		
		System.out.println("Tree Set:");
		for (String country : countrySet2) {
			System.out.println(country);
		}
		
		List<String> countryList = new ArrayList<String>(countrySet2); 
	}

}

class SortByAlphabet implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
