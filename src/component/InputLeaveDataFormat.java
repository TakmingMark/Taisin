package component;


import java.util.List;

public class InputLeaveDataFormat {
	private List<String> jobTitle;
	private List<String> teacherName;
	private List<String> leave;
	private List<String> leaveState;
	private List<String> className;
	private List<String> classTime;
	private List<String> classTeacherName;
	private List<String> course;
	private List<String> classState;
	public List<String> getJobTitle() {
		return jobTitle;
	}
	public List<String> getTeacherName() {
		return teacherName;
	}
	public List<String> getLeave() {
		return leave;
	}
	public List<String> getLeaveState() {
		return leaveState;
	}
	public List<String> getClassName() {
		return className;
	}
	public void setClassName(List<String> className) {
		this.className = className;
	}
	public List<String> getClassTime() {
		return classTime;
	}
	public List<String> getCourse() {
		return course;
	}
	public List<String> getClassState() {
		return classState;
	}
	public void setJobTitle(List<String> jobTitle) {
		this.jobTitle = jobTitle;
	}
	public void setTeacherName(List<String> teacherName) {
		this.teacherName = teacherName;
	}
	public List<String> getClassTeacherName() {
		return classTeacherName;
	}
	public void setClassTeacherName(List<String> classTeacherName) {
		this.classTeacherName = classTeacherName;
	}
	public void setLeave(List<String> leave) {
		this.leave = leave;
	}
	public void setLeaveState(List<String> leaveState) {
		this.leaveState = leaveState;
	}
	public void setClassTime(List<String> classTime) {
		this.classTime = classTime;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public void setClassState(List<String> classState) {
		this.classState = classState;
	}
}
