package Lab1;

public class Target {
	String fieldA;
	String fieldB;
	String fieldC;
	int fieldD;
	int fieldE;

	public Target(Builder builder) {
		fieldA = builder.fieldA;
		fieldB = builder.fieldB;
		fieldC = builder.fieldC;
		fieldD = builder.fieldD;
		fieldE = builder.fieldE;
	}

	private boolean isValid() {
		try {
			if (fieldA != null && (fieldB != null || fieldC != null) && (fieldD > fieldE))
				return true;
			else
				return false;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static class Builder {
		String fieldA;
		String fieldB;
		String fieldC;
		int fieldD;
		int fieldE;

		public Builder(String fieldA, String fieldB, String fieldC, int fieldD, int fieldE) {
			this.fieldA = fieldA;
			this.fieldB = fieldB;
			this.fieldC = fieldC;
			this.fieldD = fieldD;
			this.fieldE = fieldE;
		}

		public void fieldA(String fieldA) {
			this.fieldA = fieldA;
		}

		public void fieldB(String fieldB) {
			this.fieldB = fieldB;
		}

		public void fieldC(String fieldC) {
			this.fieldC = fieldC;
		}

		public void fieldD(int fieldD) {
			this.fieldD = fieldD;
		}

		public void fieldE(int fieldE) {
			this.fieldE = fieldE;
		}

		public Target build() {
			Target target = new Target(this);
			if (target.isValid()) {
				System.out.println("Object validation... Success!!!");
				return target;
			} else {
				System.out.println("Object validation... Failed!!!");
				return null;
			}

		}

	}

	public static void main(String args[]) throws Exception {
		Target.Builder tb1 = new Target.Builder("A", "B", "C", 1, 2);
		tb1.build();
		Target.Builder tb2 = new Target.Builder("A", "B", "C", 3, 2);
		tb2.build();
	}
}
