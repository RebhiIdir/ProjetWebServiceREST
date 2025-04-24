package com.cabinet.resources;

import com.cabinet.entities.RendezVous;
import com.cabinet.metier.CabinetMetier;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/rendezvous")
public class RendezVousResource {

    private static CabinetMetier cabinet = new CabinetMetier();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<RendezVous> getAllRendezVous() {
        return cabinet.getRendezVous();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public RendezVous getRendezVousById(@PathParam("id") int id) {
        return cabinet.getRendezVousById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addRendezVous(RendezVous rendezVous) {
        cabinet.addRendezVous(rendezVous);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateRendezVous(RendezVous rendezVous) {
        cabinet.updateRendezVous(rendezVous);
    }

    @DELETE
    @Path("/{id}")
    public void deleteRendezVous(@PathParam("id") int id) {
        cabinet.deleteRendezVous(id);
    }


}
