package examples.enums;

public class Runner {
	public static void main(String[] args) {
		
		for(DaysOfTheWeek d : DaysOfTheWeek.values()) {
			System.out.println(d.daysToWeekend(d.getDayOfTheWeek())+ " days left till weekend");
		}
	}
	
}
