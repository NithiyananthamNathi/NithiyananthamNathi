import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("Grape");
		list.add("pine");
		list.add("apple");
		for (String value : list) {
			System.out.println(value);
		}
		boolean total = list.contains(list);
		String num = list.get(2);
		System.out.println(num);
		
		boolean val =list.contains("apple");
		System.out.println(val);
		
		list.remove(1);
		System.out.println(list);
		
//		list.clear();
//		System.out.println(list);
		
		Set<String> set = new TreeSet<String>(list);
		set.add("nathi");
		set.add("anand");
		set.add("S");
		set.add("nathi");
		//for (String string : set) {
			
	//	}	
	System.out.println(set);

	Set<String> set1 = new HashSet<>();
	set1.add("nathi");
	set1.add("anand");
	set1.add("S");
	set1.add("nathi");
		
	System.out.println(set1);
	


	Set<String> set2 = new LinkedHashSet<>();
	set2.add("nathi");
	set2.add("anand");
	set2.add("S");
	set2.add("nathi");
		
	System.out.println(set2);
	
	Set<String> set3 = new HashSet<String>();
	set3.add("nathi");
	set3.add("anand");
	set3.add("S");
	set3.add("nathi");
		
	System.out.println(set3);
	}

}
