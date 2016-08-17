package Lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriterionFilter {
	public static void main(String argsp[]) {
		List<String> ls = Arrays.asList(
				  "Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby"
				);
				List<String> longStrings = getLongStrings(ls);
				assert longStrings.size() == 3;
				assert longStrings.get(0).equals("William");
				assert longStrings.get(1).equals("Susannah");
				assert longStrings.get(2).equals("Orinoco");
	}
	
	public static List<String> getLongStrings(List<String> list) {
		List<String> newList = new ArrayList<String>();
		for (int i = 1; i <= list.size(); i++) {
			if (list.get(i-1).length() >= 6)
				newList.add(list.get(i-1));
		}
		return newList;
	}

	public static List<String> getLongStrings(List<String> list,int threshold) {
		List<String> newList = new ArrayList<String>();
		for (int i = 1; i <= list.size(); i++) {
			if (list.get(i-1).length() >= threshold)
				newList.add(list.get(i-1));
		}
		return newList;
	}
}
