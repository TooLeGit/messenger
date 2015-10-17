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

import com.levi.messenger.Service.ProfileService;
import com.levi.messenger.model.Profile;

@Path("/profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResource
{
	private ProfileService my_service = new ProfileService();
	
	@GET
	public List<Profile> getAllProfiles ()
	{
		return new ArrayList<Profile>(my_service.getAllProfiles());
	}
	
	@GET
	@Path("/{profileId}")
	public Profile getProfile (@PathParam("profileId") final Long the_id)
	{
		return my_service.getProfile(the_id);
	}
	
	@POST
	public Profile createProfile (Profile the_profile)
	{
		return my_service.createProfile(the_profile);
	}
	
	@PUT
	@Path("/{profileId}")
	public Profile updateProfile (@PathParam("profileId") final Long the_id, 
																final Profile the_profile)
	{
		return my_service.updateProfile(the_id, the_profile);
	}
	
	@DELETE
	@Path("/{profileId}")
	public Profile deleteProfile (@PathParam("profileId") final Long the_id)
	{
		return my_service.deleteProfile(the_id);
	}
}
