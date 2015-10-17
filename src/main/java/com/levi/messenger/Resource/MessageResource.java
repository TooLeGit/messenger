package com.levi.messenger.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.levi.messenger.Service.MessengerService;
import com.levi.messenger.model.Message;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource
{
	private MessengerService my_service = new MessengerService();
	
	@GET
	public List<Message> getAllMessages(@Context UriInfo uriInfo)
	{
		return my_service.getAllMessages();
	}
	
	@GET
	@Path("{messageId}")
	public Message getMessage (@PathParam(value = "messageId") Long the_id)
	{
		return my_service.getMessage(the_id);
	}
	
	@PUT
	@Path("{messageId}")
	public Message updateMessage (@PathParam("messageId") final Long the_id, 
																Message the_message)
	{
		return my_service.updateMessage(the_id, the_message);
	}
	
	@DELETE
	@Path("{messageId}")
	public Message deleteMessage (@PathParam(value = "messageId") Long the_id)
	{
		return my_service.deleteMessage(the_id);
	}
	
	@POST
	public Message createMessage (Message the_message)
	{
		return my_service.createMessage(the_message);
	}
}
