package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Comment extends Model {

	@Id
	public Long id;
	
	@Required
	public String author;
	
	@Required
	public String content;
	
	@ManyToOne
	public Post post;
}
