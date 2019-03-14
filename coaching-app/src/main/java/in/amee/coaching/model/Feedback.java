package in.amee.coaching.model;

import java.sql.Date;

public class Feedback {
       private int feedId;
       private  String feedDesc;
       private int instId;
       private Date created;
       private int userId;
       private UserProfile userProfile;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(int feedId, String feedDesc, int instId, Date created, int userId) {
		super();
		this.feedId = feedId;
		this.feedDesc = feedDesc;
		this.instId = instId;
		this.created = created;
		this.userId = userId;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getFeedDesc() {
		return feedDesc;
	}
	public void setFeedDesc(String feedDesc) {
		this.feedDesc = feedDesc;
	}
	public int getInstId() {
		return instId;
	}
	public void setInstId(int instId) {
		this.instId = instId;
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
	public UserProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
       
       
}
