package com.cabinet.entities;

import java.util.Date;

public class RendezVous {

    private int id;
    private Patient patient;
    private Medecin medecin;
    private Date date;
    private String motif;


    public RendezVous(){}

    public RendezVous(int id, Patient patient, Medecin medecin, Date date, String motif) {
        this.id = id;
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        this.motif = motif;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public Medecin getMedecin() { return medecin; }
    public void setMedecin(Medecin medecin) { this.medecin = medecin; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }



}
