package com.jcg.webservice;

import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/musicalInstrument")
public class MusicalController {

	private MusicService musManager = new MusicService();

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<MusicalInstrument> getAll() {
		return musManager.getAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public MusicalInstrument get( @PathParam("id") Integer id) {
		return musManager.get(id);
	}

	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public MusicalInstrument create( @PathParam("id") Integer id,  MusicalInstrument instrument) {
		return musManager.update(id, instrument);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public MusicalInstrument update(MusicalInstrument instrument) {
		return musManager.create(instrument);
	}

	@DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void delate( @PathParam ("id") Integer id) {
		musManager.delate(id);
	}

}
