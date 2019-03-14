package in.amee.coaching.model;

import java.util.Date;

public class Receipt {
       private int receiptId;
       private int courseId;
       private Date created;
       private int user_id;
       private String narration;
       private int amount;
       private Course course;
       private User user;
	public Receipt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Receipt(int receiptId, int courseId, Date created, int user_id, String narration, int amount) {
		super();
		this.receiptId = receiptId;
		this.courseId = courseId;
		this.created = created;
		this.user_id = user_id;
		this.narration = narration;
		this.amount = amount;
	}
	public int getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}       
}
