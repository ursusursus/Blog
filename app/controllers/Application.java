package controllers;

import models.Comment;
import models.Post;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return redirect(routes.Application.posts());
  }
  
  public static Result posts() {
	  return ok(views.html.index.render(Post.getAll()));
  }
  
  public static Result show(Long id) {
	  return ok(views.html.show.render(Post.getById(id)));
  }
  
  public static Result create() {
	  Form<Post> form = form(Post.class).bindFromRequest();
	  Post post = form.get();
	  post.save();
	  
	  return redirect(routes.Application.posts());
  }
  
  public static Result createComment(Long id) {
	  Post post = Post.getById(id);
	  
	  Form<Comment> form = form(Comment.class).bindFromRequest();
	  Comment comment = form.get();
	  comment.post = post;
	  comment.save();
	  
	  return redirect(routes.Application.show(id));
	  
  }
  
}