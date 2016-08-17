package Lab2;

import java.util.Iterator;

public class Sequence implements Iterable {
	private Object[] data;
	private int count;
	private int size = 10;
	SequenceIterator iterator;

	public void add(Object o) throws Exception {
		if (count == size) {
			System.out.println("Sequence Index out of bound...");
			throw new Exception();
		} else {
			data[count] = o;
			count++;
		}

	}

	public Sequence() {
		data = new Object[size];
		iterator = new SequenceIterator();
	}

	public Object get(int idx) {
		return iterator.next();
	}

	public int size() {
		return count;
	}

	@Override
	public Iterator iterator() {
		return new SequenceIterator();
	}

	class SequenceIterator implements Iterator {
		int progress = 0;

		@Override
		public boolean hasNext() {
			if (progress < count)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
//			progress++;
			return data[progress++];
		}
	}
}
