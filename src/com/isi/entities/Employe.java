package com.isi.entities;

public class Employe extends Personne {
    private int mat_solde;
    private String departement;

    public Employe(){
    }
    public Employe (int mat_solde, String departement, String nom, String prenom, String adresse, int tel){
        super(nom, prenom, adresse, tel);
        this.mat_solde = mat_solde;
        this.departement = departement;
    }

    public int getMat_solde() {
        return mat_solde;
    }

    public void setMat_solde(int mat_solde) {
        this.mat_solde = mat_solde;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}
