package com.levi.messenger.Resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.levi.messenger.Service.CommentService;
import com.levi.messenger.model.Comment;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource
{
	private CommentService my_service = new CommentService();
	
	@GET
	public List<Comment> getAllComments (@PathParam("messageId") final Long the_message_id)
	{
		return new ArrayList<Comment>(my_service.getAllComments(the_message_id));
	}
	
	@GET
	@Path("/{commentId}")
	public Comment getComment (@PathParam("messageId") final Long the_message_id,
														 @PathParam("commentId") final Long the_comment_id)
	{
		return my_service.getComment(the_message_id, the_comment_id);
	}
	
	@POST
	public Comment createComment(@PathParam("messageId") final Long the_message_id,
															 Comment the_comment)
	{
		return my_service.createComment(the_message_id, the_comment);
	}
	
	@PUT
	@Path("/{commentId}")
	public Comment updateComment(@PathParam("messageId") final Long the_message_id,
															 @PathParam("commentId") final Long the_comment_id,
															 Comment the_comment)
	{
		return my_service.updateComment(the_message_id, the_comment_id, the_comment);
	}
	
	
	@DELETE
	@Path("/{commentId}")
	public Comment deleteComment (@PathParam("messageId") final Long the_message_id, 
																@PathParam("commentId") final Long the_comment_id)
	{
		return my_service.deleteComment(the_message_id, the_comment_id);
	}
	
}
