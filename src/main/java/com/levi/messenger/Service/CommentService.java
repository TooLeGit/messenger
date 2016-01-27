package com.levi.messenger.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.levi.messenger.database.DatabaseClass;
import com.levi.messenger.model.Comment;
import com.levi.messenger.model.Message;

public class CommentService
{
	private Map<Long, Message> my_messages = DatabaseClass.getMessages();
	
	public CommentService ()
	{
		setupMap();
	}
	
	private final void setupMap ()
	{
		long comment_index = 1L;
		
		for (final Message message : my_messages.values())
		{
			message.getComments().put(comment_index, 
																new Comment(comment_index, 
																						"This is comment #" + comment_index++, 
																						Calendar.getInstance().getTime(), 
																						message.getAuthor()));
		}
	}
	
	public List<Comment> getAllComments (final Long the_message_id)
	{
		return new ArrayList<Comment>(my_messages.get(the_message_id).getComments().values());
		//return new ArrayList<Comment>(DatabaseClass.getComments(the_message_id).values());
	}
	
	public Comment getComment (final Long the_message_id, final Long the_comment_id)
	{
		return my_messages.get(the_message_id).getComments().get(the_comment_id);
		//return DatabaseClass.getComments(the_message_id).get(the_comment_id);
	}
	
	public Comment createComment (final Long the_message_id, Comment the_comment)
	{
		Map<Long, Comment> comments = my_messages.get(the_message_id).getComments();
		the_comment.setId(comments.size() + 1L);
		comments.put(the_comment.getId(), the_comment);
		
		return the_comment;
	}
	
	public Comment updateComment (final Long the_message_id, final Long the_comment_id,
																final Comment the_comment)
	{
		Map<Long, Comment> comments = my_messages.get(the_message_id).getComments();
		comments.put(the_comment_id, the_comment);
		
		return the_comment;
	}
	
	public Comment deleteComment (final Long the_message_id, final Long the_comment_id)
	{
		//return DatabaseClass.getComments(the_message_id).remove(the_comment_id);
		return my_messages.get(the_message_id).getComments().remove(the_comment_id);
	}
}
