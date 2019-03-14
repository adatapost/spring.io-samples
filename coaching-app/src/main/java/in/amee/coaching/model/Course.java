package in.amee.coaching.model;

import java.sql.Date;

public class Course {
       private int courseId;
       private String courseName;
       private int instId;
       private boolean isActive;
       private String courseDesc;
       private String courseFees;
       private Date updated;
       private Date created;
       private Institute institute;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, int instId, boolean isActive, String courseDesc, String courseFees,
			Date updated, Date created) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.instId = instId;
		this.isActive = isActive;
		this.courseDesc = courseDesc;
		this.courseFees = courseFees;
		this.updated = updated;
		this.created = created;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getInstId() {
		return instId;
	}
	public void setInstId(int instId) {
		this.instId = instId;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public String getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(String courseFees) {
		this.courseFees = courseFees;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Institute getInstitute() {
		return institute;
	}
	public void setInstitute(Institute institute) {
		this.institute = institute;
	}
       
       
}
