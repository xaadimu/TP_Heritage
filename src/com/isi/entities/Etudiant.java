package com.isi.entities;

public class Etudiant extends Personne {
    private String code;
    private String classe;

    public Etudiant (){
    }
    public Etudiant (String code, String classe, String nom, String prenom, String adresse, int tel){
        super(nom, prenom, adresse, tel);
        this.code = code;
        this.classe = classe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
