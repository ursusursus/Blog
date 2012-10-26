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
			post.content="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ligula tortor, rutrum sed placerat in, fringilla a arcu. Quisque tincidunt orci in lectus lobortis malesuada dictum nisl mattis. Sed metus nulla, adipiscing non ultricies vitae, congue a felis. In ligula urna, ornare at convallis et, mollis vitae urna. Morbi pharetra nisi id ligula tempor vitae condimentum nisi commodo. Vestibulum ut ipsum lorem, in mattis metus. Donec nec varius sapien. Quisque vitae ullamcorper sapien. Nulla in lorem quis dui commodo laoreet sit amet interdum turpis. Sed a justo ante. Nam at gravida augue. Curabitur quis ullamcorper leo.";
			post.save();
			
			Post post2 = new Post();
			post2.title="Post #2";
			post2.content="Suspendisse leo ante, ornare et ultrices nec, commodo vitae neque. Proin dictum diam quis nibh elementum et consequat ipsum aliquam. Vestibulum ante ipsum.";
			post2.save();
			
			/*Comment comment = new Comment();
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
			comment3.save();*/
			
		}
	}

}

