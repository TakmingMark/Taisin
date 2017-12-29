package Component;


import java.util.List;

public class InputCalendarDataComponent {
	private List<String> year;
	private List<String> month;
	private List<String> day;
	private List<String> hour;
	private List<String> minute;
	private List<String> second;
	
	public List<String> getYear() {
		return year;
	}
	public List<String> getMonth() {
		return month;
	}
	public List<String> getDay() {
		return day;
	}
	public List<String> getHour() {
		return hour;
	}
	public List<String> getMinute() {
		return minute;
	}
	public List<String> getSecond() {
		return second;
	}
	public void setYear(List<String> year) {
		this.year = year;
	}
	public void setMonth(List<String> month) {
		this.month = month;
	}
	public void setDay(List<String> day) {
		this.day = day;
	}
	public void setHour(List<String> hour) {
		this.hour = hour;
	}
	public void setMinute(List<String> minute) {
		this.minute = minute;
	}
	public void setSecond(List<String> second) {
		this.second = second;
	}
}
