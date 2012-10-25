package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Post extends Model {
	
	@Id
	public Long id;
		
	@Required
	public String title;
	
	@Required
	public String content;
	
	
	@OneToMany
	public List<Comment> comments;
	
	public static Finder<Long, Post> finder = new Finder<Long, Post>(Long.class, Post.class);	
	
	public static List<Post> getAll() {
		return finder.all(); 
	}
		
	public static Post getById(Long id) {
		return finder.byId(id);
	}

}
