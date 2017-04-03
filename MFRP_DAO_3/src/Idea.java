import java.sql.Date;


public class Idea {
private int id;
private String description;
private Date postedDate;
private User postedBy;
private String status;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getPostedDate() {
	return postedDate;
}
public void setPostedDate(Date postedDate) {
	this.postedDate = postedDate;
}
public User getPostedBy() {
	return postedBy;
}
public void setPostedBy(User postedBy) {
	this.postedBy = postedBy;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Idea(int id, String description, Date postedDate, User postedBy,
		String status) {
	super();
	this.id = id;
	this.description = description;
	this.postedDate = postedDate;
	this.postedBy = postedBy;
	this.status = status;
}




}
