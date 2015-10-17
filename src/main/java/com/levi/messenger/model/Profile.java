package com.levi.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile
{
	private Long my_id;
	private String my_name;
	private Date my_creation_date;
	
	public Profile(){}
	
	public Profile (final Long the_id, final String the_name, final Date the_creation_date)
	{
		my_id = the_id;
		my_name = the_name;
		my_creation_date = the_creation_date;
	}

	public Long getId()
	{
		return my_id;
	}

	public void setId(final Long the_id)
	{
		my_id = the_id;
	}
	
	public String getName()
	{
		return my_name;
	}

	public void setName(final String the_name)
	{
		my_name = the_name;
	}

	public Date getCreationDate()
	{
		return my_creation_date;
	}

	public void setCreationDate(final Date the_creation_date)
	{
		my_creation_date = the_creation_date;
	}
}
