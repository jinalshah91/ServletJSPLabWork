package Lab2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CriterionFilter {
	public static void main(String argsp[]) {
		List<String> ls = Arrays.asList("Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby", "Jinal");
		List<String> longStrings = getLongStrings(ls);
		assert longStrings.size() == 3;
		assert longStrings.get(0).equals("William");
		assert longStrings.get(1).equals("Susannah");
		assert longStrings.get(2).equals("Orinoco");

		List<String> longStrings2 = getLongStrings(ls, 6);

		/*
		 * StringCriterion for longer than a threshold
		 */
		StringCriterion<String> sc1 = new StringCriterionImpl1<String>(5);
		Filter sf1 = new Filter();
		assert sf1.filter(ls, sc1).size() == 5;

		/*
		 * StringCriterion for determining if the first letter of the string is
		 * in the range 'A' to 'M'
		 */
		StringCriterion sc2 = new StringCriterionImpl2();
		Filter sf2 = new Filter();
		assert sf2.filter(ls, sc2).size() == 5;
		/*
		 * StringCriterion for checking the keyword in a string
		 */
		StringCriterion sc3 = new StringCriterionImpl3("Jinal");
		Filter sf3 = new Filter();
		assert sf3.filter(ls, sc3).size() == 1;

		/*
		 * Criterion<Integer> type
		 */
		StringCriterion<Integer> sc4 = new IntegerCriterion<Integer>(2);
		Filter sf4 = new Filter();
		assert sf4.filter(ls, sc4).size() == 1;

		/*
		 * Criterion<LocalDate> type
		 */
		Date input = new Date();
		LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		StringCriterion sc5 = new DateCriterion<LocalDate>(date);
		Filter sf5 = new Filter();
		assert sf5.filter(ls, sc5).size() == 1;

	}

	public static List<String> getLongStrings(List<String> list) {
		List<String> newList = new ArrayList<String>();
		for (int i = 1; i <= list.size(); i++) {
			if (list.get(i - 1).length() >= 6)
				newList.add(list.get(i - 1));
		}
		return newList;
	}

	public static List<String> getLongStrings(List<String> list, int threshold) {
		List<String> newList = new ArrayList<String>();
		for (int i = 1; i <= list.size(); i++) {
			if (list.get(i - 1).length() >= threshold)
				newList.add(list.get(i - 1));
		}
		return newList;
	}

	public static List<String> stringFilter(List<String> list, StringCriterion stcr) {
		List<String> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (stcr.test(list.get(i))) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
}
