package com.levi.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comment
{
	private Long my_id;
	private String my_message;
	private Date my_creation_date;
	private String my_author;
	
	public Comment () {}
	
	public Comment (final Long the_id, final String the_message,
									final Date the_creation_date, final String the_author)
	{
		my_id = the_id;
		my_message = the_message;
		my_creation_date = the_creation_date;
		my_author = the_author;
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
	
	public Date getCreationDate ()
	{
		return my_creation_date;
	}
	
	public void setCreationDate (final Date the_creation_date)
	{
		my_creation_date = the_creation_date;
	}
	
	public String getAuthor ()
	{
		return my_author;
	}
	
	public void setAuthor (final String the_author)
	{
		my_author = the_author;
	}
}
