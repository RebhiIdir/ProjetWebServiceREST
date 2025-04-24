package com.cabinet.metier;

import com.cabinet.entities.Patient;
import com.cabinet.entities.Medecin;
import com.cabinet.entities.RendezVous;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

public class CabinetMetier {
    private List<Patient> patients = new ArrayList<>();
    private List<Medecin> medecins = new ArrayList<>();
    private List<RendezVous> rendezVousList = new ArrayList<>();

    // ------------------ PATIENT ------------------
    public void addPatient(Patient p) {
        patients.add(p);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public Patient getPatientById(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void updatePatient(Patient newPatient) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == newPatient.getId()) {
                patients.set(i, newPatient);
                return;
            }
        }
    }

    public void deletePatient(int id) {
        patients.removeIf(p -> p.getId() == id);
    }

    // ------------------ MEDECIN ------------------
    public void addMedecin(Medecin m) {
        medecins.add(m);
    }

    public List<Medecin> getMedecins() {
        return medecins;
    }

    public Medecin getMedecinById(int id) {
        for (Medecin m : medecins) {
            if (m.getId() == id) return m;
        }
        return null;
    }

    public void updateMedecin(Medecin newMedecin) {
        for (int i = 0; i < medecins.size(); i++) {
            if (medecins.get(i).getId() == newMedecin.getId()) {
                medecins.set(i, newMedecin);
                return;
            }
        }
    }

    public void deleteMedecin(int id) {
        medecins.removeIf(m -> m.getId() == id);
    }

    // ------------------ RENDEZVOUS ------------------
    public void addRendezVous(RendezVous r) {
        rendezVousList.add(r);
    }

    public List<RendezVous> getRendezVous() {
        return rendezVousList;
    }

    public RendezVous getRendezVousById(int id) {
        for (RendezVous r : rendezVousList) {
            if (r.getId() == id) return r;
        }
        return null;
    }

    public void updateRendezVous(RendezVous newRV) {
        for (int i = 0; i < rendezVousList.size(); i++) {
            if (rendezVousList.get(i).getId() == newRV.getId()) {
                rendezVousList.set(i, newRV);
                return;
            }
        }
    }

    public void deleteRendezVous(int id) {
        rendezVousList.removeIf(r -> r.getId() == id);
    }
}
