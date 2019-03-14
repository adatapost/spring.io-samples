package in.amee.coaching.model;

import java.util.Date;

public class Booking {
       private int bookId;
       private int courseId;
       private Date created;
       private int userId;
       private String paymentMethod;
       private Course course;
       private User user;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bookId, int courseId, Date created, int userId, String paymentMethod) {
		super();
		this.bookId = bookId;
		this.courseId = courseId;
		this.created = created;
		this.userId = userId;
		this.paymentMethod = paymentMethod;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
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
