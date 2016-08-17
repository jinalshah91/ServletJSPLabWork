package Lab2;

public class IntegerCriterion<T> implements StringCriterion<T> {

	private int len;

	public IntegerCriterion(int len) {
		this.len = len;
	}

	@Override
	public boolean test(T t) {
		if ((Integer) t > getLen())
			return true;
		return false;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}
}
