package examples.enums;

public enum DaysOfTheWeek {
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);

	private final int dayOfTheWeek;
	
	DaysOfTheWeek(int i) {
		this.dayOfTheWeek = i;
	}
	
	public int daysToWeekend(int i) {
		int result = 6 - i;
		if(result <= 0) {
			return 0;
		}
		return result;
	}

	public int getDayOfTheWeek() {
		return dayOfTheWeek;
	}
}
