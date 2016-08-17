package Lab1;

public class ClothingPair<T extends Colored  & Sized> {
	public T p1;
	public T p2;

	public ClothingPair(T p1, T p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public boolean isMatched() {
		if (p1.getColor().equals(p2.getColor()) && p1.getSize() == p2.getSize())
			return true;
		else
			return false;
	}

	public boolean isSame() {
		if (p1.getClass().getName().equals(p2.getClass().getName()))
			return true;
		else
			return false;
	}
}
