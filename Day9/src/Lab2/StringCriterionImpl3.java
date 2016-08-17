package Lab2;

public class StringCriterionImpl3 implements StringCriterion {

	private String keyword;

	StringCriterionImpl3(String key) {
		keyword = key;
	}

	@Override
	public boolean test(String str) {
		// TODO Auto-generated method stub
		if (str.contains(keyword)) {
			return true;
		} else
			return false;
	}

}
