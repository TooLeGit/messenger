package com.levi.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
	private Long my_id;
	private String my_message;
	private String my_author;
	private Date my_creation_date;
	
	public Message (){}
	
	public Message (final Long the_id, final String the_message,
										final String the_author, final Date the_creation_date)
	{
		my_id = the_id;
		my_message = the_message;
		my_author = the_author;
		my_creation_date = the_creation_date;
	}
	
	public Long getId ()
	{
		return my_id;
	}
	
	public void setId (final Long the_id)
	{
		my_id = the_id;
	}
	
	public String getMessage ()
	{
		return my_message;
	}
	
	public void setMessage (final String the_message)
	{
		my_message = the_message;
	}
	
	public String getAuthor ()
	{
		return my_author;
	}
	
	public void setAuthor (final String the_author)
	{
		my_author = the_author;
	}
	
	public Date getCreationDate ()
	{
		return my_creation_date;
	}
	
	public void setCreationDate (final Date the_creation_date)
	{
		my_creation_date = the_creation_date;
	}
	
	@Override
	public String toString ()
	{
		final StringBuffer buffer = new StringBuffer();
		
		buffer.append("ID: ").append(getId()).append(", ");
		buffer.append("Message: ").append(getMessage()).append(", ");
		buffer.append("Author: ").append(getAuthor()).append(", ");
		buffer.append("Creation Date: ").append(getCreationDate());
		
		return buffer.toString();
	}
}
