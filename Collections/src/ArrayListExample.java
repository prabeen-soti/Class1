import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
//		String [] abc = {"abc","bcd"};
		List<String> countryList = new ArrayList<String>();
		System.out.println(countryList.isEmpty());
		countryList.add("Nepal");
		countryList.add("China");
		countryList.add("USA");
		countryList.add("Japan");
		
		System.out.println(countryList.isEmpty());
		System.out.println(countryList.contains("USA"));
		System.out.println(countryList.contains("UK"));
		
		// loop 1
		Iterator<String> itr = countryList.iterator();
		while(itr.hasNext()) {
			String country = itr.next();
			System.out.println(country);
			if(country.equals("Japan")) {
				itr.remove();
			}
		}
		ListIterator<String> itr1 = countryList.listIterator();
		while(itr1.hasNext()) {
			String country = itr1.next();
			System.out.println(country);
		}
		while(itr1.hasPrevious()) {
			String country = itr1.previous();
			System.out.println(country);
		}
		// loop 2
		for (String country : countryList) {
			System.out.println(country);
		}

	}

}
