package com.cabinet.resources;
import com.cabinet.entities.Patient;
import com.cabinet.metier.CabinetMetier;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;


@Path("/patients")
public class PatientResource {

    private static CabinetMetier cabinet = new CabinetMetier();


    @GET
    //@produces indique le format de réponse

    @Produces(MediaType.APPLICATION_JSON)
    public List<Patient> getPatients(){
        return cabinet.getPatients();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getPatientById(@PathParam("id") int id) {
        return cabinet.getPatientById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPatient(Patient patient) {
        cabinet.addPatient(patient);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePatient(Patient patient) {
        cabinet.updatePatient(patient);
    }

    @DELETE
    @Path("/{id}")
    public void deletePatient(@PathParam("id") int id) {
        cabinet.deletePatient(id);
    }
}


