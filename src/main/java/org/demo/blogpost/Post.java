/**
 * 
 */
package org.demo.blogpost;

/**
 * @author suraj
 *
 */
public class Post {

	public static void main(String[] args) {
		
		PostInfo postInfo = new PostInfo(1L, "Post 1", new Author(1101L, "Author 1", 10000L));
		System.out.println(postInfo.id());
		System.out.println(postInfo.title());
		System.out.println(postInfo.author());
		System.out.println(postInfo.author().name());
		System.out.println(postInfo.author().followers());
		System.out.println(postInfo.hashCode());
		System.out.println(postInfo.toString());
		
	}
	
}


/*
 * class PostInfo { private final Long id; private final String title;
 * 
 * public Long getId() { return id; }
 * 
 * public String getTitle() { return title; }
 * 
 * public PostInfo(Long id, String title) { super(); this.id = id; this.title =
 * title; }
 * 
 * }
 */

