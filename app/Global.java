import models.Comment;
import models.Post;
import play.Application;
import play.GlobalSettings;
import play.Logger;


public class Global extends GlobalSettings {
	
	@Override
	public void onStart(Application arg0) {
		if(Post.finder.findRowCount() == 0) {
			Logger.info("Initing data");
			
			Post post = new Post();
			post.title="Post #1";
			post.content="ASdnadsdmn asdnasd adnsmdnsma dasnmdsam.";
			post.save();
			
			Post post2 = new Post();
			post2.title="Post #2";
			post2.content="ASdnadsdmn asdnasd adnsmdnsma dasnmdsam.";
			post2.save();
			
			Comment comment = new Comment();
			comment.content="This is a comment #1";
			comment.post = post;
			comment.save();
			
			Comment comment2 = new Comment();
			comment2.content="This is a comment #2";
			comment2.post = post;
			comment2.save();
			
			Comment comment3 = new Comment();
			comment3.content="This is a comment #3";
			comment3.post = post2;
			comment3.save();
			
		}
	}

}

