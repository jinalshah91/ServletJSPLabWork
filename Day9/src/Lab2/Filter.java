package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Filter {
	public List filter(List<String> list, StringCriterion filter) {
		List<String> result = new ArrayList<String>();
		for (String str : list) {
			if (filter.test(str) == true)
				result.add(str);
		}
		return result;
	}
}
