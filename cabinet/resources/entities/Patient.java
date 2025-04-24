package com.cabinet.entities;

public class Patient {

    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String email;
    private String telephone;

    public Patient() {}

    //Constructeur
    public Patient(int id, String nom, String prenom, int age, String email, String telephone) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
        this.telephone = telephone;

    }

    //Getters et Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }




}
