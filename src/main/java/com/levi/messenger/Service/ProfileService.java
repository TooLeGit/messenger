package com.levi.messenger.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.levi.messenger.database.DatabaseClass;
import com.levi.messenger.model.Profile;

public class ProfileService
{
	private Map<Long, Profile> my_profiles = DatabaseClass.getProfiles();
	
	public ProfileService()
	{
		setupMap();
	}
	
	private final void setupMap ()
	{
		my_profiles.put(1L, new Profile(1L, "Levi", Calendar.getInstance().getTime()));
		my_profiles.put(2L, new Profile(2L, "Mevi", Calendar.getInstance().getTime()));
	}
	
	public List<Profile> getAllProfiles ()
	{
		return new ArrayList<Profile>(my_profiles.values());
	}
	
	public Profile getProfile (final Long the_id)
	{
		return my_profiles.get(the_id);
	}
	
	public Profile createProfile (Profile the_profile)
	{
		the_profile.setId(my_profiles.size() + 1L);
		my_profiles.put(the_profile.getId(), the_profile);
		
		return the_profile;
	}
	
	public Profile updateProfile (final Long the_id, final Profile the_profile)
	{
		my_profiles.put(the_id, the_profile);
		
		return the_profile;
	}
	
	public Profile deleteProfile (final Long the_id)
	{
		return my_profiles.remove(the_id);
	}
}
