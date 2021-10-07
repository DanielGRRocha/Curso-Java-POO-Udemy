package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> listComments = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date moment, String title, String content, Integer likes) {
		
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	//getters and setters
	//moment
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	//title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//content
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	//likes
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	//comments
	public List<Comment> getListComments() {
		return listComments;
	}
	//método addComment que ligará a classe Post com a Comment (composição de objetos - add e remover da lista)
	public void addComment(Comment comment) {
		listComments.add(comment);
	}
	public void removeComment(Comment comment) {
		listComments.remove(comment);
	}
	
	//toString usando StringBuilder
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		
		for(Comment c : listComments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	

}//class
