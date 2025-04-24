package com.cabinet.resources;

import com.cabinet.entities.Medecin;
import com.cabinet.metier.CabinetMetier;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/medecins")
public class MedecinResource {

    private static CabinetMetier cabinet = new CabinetMetier();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Medecin> getAllMedecins() {
        return cabinet.getMedecins();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Medecin getMedecinById(@PathParam("id") int id) {
        return cabinet.getMedecinById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addMedecin(Medecin medecin) {
        cabinet.addMedecin(medecin);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateMedecin(Medecin medecin) {
        cabinet.updateMedecin(medecin);
    }

    @DELETE
    @Path("/{id}")
    public void deleteMedecin(@PathParam("id") int id) {
        cabinet.deleteMedecin(id);
    }
}
