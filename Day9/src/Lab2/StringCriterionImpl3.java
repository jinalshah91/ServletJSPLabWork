package Lab2;

public class StringCriterionImpl3<T> implements StringCriterion<T> {

	private String keyword;

	StringCriterionImpl3(String key) {
		keyword = key;
	}

	@Override
	public boolean test(T t) {
		String str = (String)t;
		// TODO Auto-generated method stub
		if (str.contains(keyword)) {
			return true;
		} else
			return false;
	}

}
