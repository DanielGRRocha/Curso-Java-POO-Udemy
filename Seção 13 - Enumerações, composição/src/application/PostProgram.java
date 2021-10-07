package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class PostProgram {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment comment1 = new Comment("Show, nice trip!");
		Comment comment2 = new Comment("You're crazy haha");
		
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zealand",
				"I'm going to visit this wonderful country tomorrow", 15);
		
		post1.addComment(comment1);
		post1.addComment(comment2);
		
		System.out.println(post1);
		
	}

}
