package Lab2;

public class StringCriterionImpl1 implements StringCriterion {

	private int len = 0;

	StringCriterionImpl1(int len) {
		this.len = len;
	}

	@Override
	public boolean test(String str) {
		// TODO Auto-generated method stub
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
