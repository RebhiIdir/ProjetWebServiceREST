package com.cabinet.entities;

public class Medecin {

    private int id;
    private String nom;
    private String specialite;
    private String telephone;
    private String email;

    public Medecin() {}

    public Medecin(int id, String nom, String specialite, String telephone, String email) {
        this.id = id;
        this.nom = nom;
        this.specialite = specialite;
        this.telephone = telephone;
        this.email = email;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getSpecialite() { return specialite; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}
