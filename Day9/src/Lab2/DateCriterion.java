package Lab2;

import java.time.LocalDate;

public class DateCriterion<T> implements StringCriterion<T> {
	LocalDate d;

	DateCriterion(LocalDate d) {
		this.d = d;
	}

	@Override
	public boolean test(T t) {
		// TODO Auto-generated method stub
		LocalDate date = (LocalDate) t;

		if (date.isEqual(d))
			return true;
		return false;
	}

}
