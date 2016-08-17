package Lab2;

public class StringCriterionImpl2<T> implements StringCriterion<T> {

	@Override
	public boolean test(T t) {
		String str = (String)t;
		char ch = str.toCharArray()[0];
		if (ch >= 'A' && ch <= 'M')
			return true;
		else
			return false;
	}

}
