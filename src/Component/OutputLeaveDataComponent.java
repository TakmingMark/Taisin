package Component;

import java.util.List;

public class OutputLeaveDataComponent {
	private String startCalendar;
	private String leaveState;
	private String businessAgent;
	private String endCalendar;
	private String jobTitle;
	private String eventDescription;
	private List<AgentData> agentData;
	private String fillInPeople;


	public String getStartCalendar() {
		return startCalendar;
	}


	public String getLeaveState() {
		return leaveState;
	}


	public String getBusinessAgent() {
		return businessAgent;
	}


	public String getEndCalendar() {
		return endCalendar;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public String getEventDescription() {
		return eventDescription;
	}


	public List<AgentData> getAgentData() {
		return agentData;
	}


	public String getFillInPeople() {
		return fillInPeople;
	}


	public void setStartCalendar(String startCalendar) {
		this.startCalendar = startCalendar;
	}


	public void setLeaveState(String leaveState) {
		this.leaveState = leaveState;
	}


	public void setBusinessAgent(String businessAgent) {
		this.businessAgent = businessAgent;
	}


	public void setEndCalendar(String endCalendar) {
		this.endCalendar = endCalendar;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}


	public void setAgentData(List<AgentData> agentData) {
		this.agentData = agentData;
	}


	public void setFillInPeople(String fillInPeople) {
		this.fillInPeople = fillInPeople;
	}


	class AgentData{
		private String courseName;
		private String courseAgent;
		private String className;
		private String classTeacher;
		private String classTime;
		
		public String getCourseName() {
			return courseName;
		}
		public String getCourseAgent() {
			return courseAgent;
		}
		public String getClassName() {
			return className;
		}
		public String getClassTeacher() {
			return classTeacher;
		}
		public String getClassTime() {
			return classTime;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public void setCourseAgent(String courseAgent) {
			this.courseAgent = courseAgent;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public void setClassTeacher(String classTeacher) {
			this.classTeacher = classTeacher;
		}
		public void setClassTime(String classTime) {
			this.classTime = classTime;
		}
		
		
	}
}

