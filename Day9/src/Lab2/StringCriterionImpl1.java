package Lab2;

public class StringCriterionImpl1<T> implements StringCriterion<T>{

	private int len = 0;

	StringCriterionImpl1(int len) {
		this.len = len;
	}

	@Override
	public boolean test(T t) {
		// TODO Auto-generated method stub
		String str = (String)t;
		if (str.length() > this.getLen())
			return true;
		else
			return false;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

}
