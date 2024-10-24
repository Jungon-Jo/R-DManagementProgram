package DTO;

public class ProjectDTO {
	private String projectName = null;
	private int projectDate = 0;
	private long projectBudget = 0;
	private String projectOutline = null;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getProjectDate() {
		return projectDate;
	}
	public void setProjectDate(int projectDate) {
		this.projectDate = projectDate;
	}
	public long getProjectBudget() {
		return projectBudget;
	}
	public void setProjectBudget(long projectBudget) {
		this.projectBudget = projectBudget;
	}
	public String getProjectOutline() {
		return projectOutline;
	}
	public void setProjectOutline(String projectOutline) {
		this.projectOutline = projectOutline;
	}
	@Override
	public String toString() {
		return "ProjectDTO [projectName=" + projectName + ", projectDate=" + projectDate + ", projectBudget="
				+ projectBudget + "]";
	}
	
	
}
