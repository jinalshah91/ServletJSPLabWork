package Lab2;

public class StringCriterionImpl2 implements StringCriterion {

	@Override
	public boolean test(String str) {
		char ch = str.toCharArray()[0];
		if (ch >= 'A' && ch <= 'M')
			return true;
		else
			return false;
	}

}
