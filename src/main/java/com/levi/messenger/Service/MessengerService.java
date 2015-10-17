package com.levi.messenger.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.levi.messenger.database.DatabaseClass;
import com.levi.messenger.model.Message;

public class MessengerService
{
	private Map<Long, Message> my_messages = DatabaseClass.getMessages();
	
	public MessengerService ()
	{		
		setupMap();
	}
	
	private final void setupMap ()
	{
		my_messages.put(1L, new Message(1L, "Hello, World!", 
																		"Levi", Calendar.getInstance().getTime()));
		my_messages.put(2L, new Message(2L, "Hello, Jersey!", 
																		"Mevi", Calendar.getInstance().getTime()));
	}
	
	public List<Message> getAllMessages ()
	{
		return new ArrayList<Message>(my_messages.values());
	}
	
	public Message getMessage (final Long the_id)
	{
		return my_messages.get(the_id);
	}
	
	public Message updateMessage (final Long the_id, final Message the_message)
	{
		my_messages.put(the_id, the_message);
		
		return the_message;
	}
	
	public Message deleteMessage (final Long the_id)
	{
		return my_messages.remove(the_id);
	}
	
	public Message createMessage (Message the_message)
	{
		the_message.setId(my_messages.size() + 1L);
		my_messages.put(the_message.getId(), the_message);
		
		return the_message;
	}
}
