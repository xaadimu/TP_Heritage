package com.isi.entities;

public class Professeur extends Personne{
    private String compte_prof;
    private String domaine;

    public Professeur (){
    }
    public Professeur (String compte_prof, String domaine,  String nom, String prenom, String adresse, int tel){
        super(nom, prenom, adresse, tel);
        this.compte_prof = compte_prof;
        this.domaine = domaine;
    }

    public String getCompte_prof() {
        return compte_prof;
    }

    public void setCompte_prof(String compte_prof) {
        this.compte_prof = compte_prof;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
}
