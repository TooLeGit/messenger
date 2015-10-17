package com.levi.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.levi.messenger.model.Message;
import com.levi.messenger.model.Profile;

public class DatabaseClass
{
	private static Map<Long, Message> my_messages = new HashMap<Long, Message>();
	private static Map<Long, Profile> my_profiles = new HashMap<Long, Profile>();
	
	public static Map<Long, Message> getMessages()
	{
		return my_messages;
	}
	
	public static Map<Long, Profile> getProfiles()
	{
		return my_profiles;
	}
}
