package com.isi.controller;

import com.isi.entities.Etudiant;

import java.util.Scanner;

public class EtudiantImpl implements IEtudiant{
    private Scanner scan = new Scanner(System.in);

    public Etudiant saisie() {
        Etudiant e = new Etudiant();
        System.out.println("Saisir un code");
        e.setCode(scan.nextLine());

        System.out.println("Saisir la classe");
        e.setClasse(scan.nextLine());

        System.out.println("Saisir le Nom");
        e.setNom(scan.nextLine());

        System.out.println("Saisir le Prenom");
        e.setPrenom(scan.nextLine());

        System.out.println("Saisir l'adresse");
        e.setAdresse(scan.nextLine());

        System.out.println("Saisir le Numero de Telephone");
        e.setTel(Integer.parseInt(scan.nextLine()));
        return e;
    }

    public void affichageLIAGE3(Etudiant etudiant) {
        if (etudiant.getClasse().equalsIgnoreCase("LIAGE3")) {
            System.out.println("Code : " + etudiant.getCode());
            System.out.println("Classe : " + etudiant.getClasse());
            System.out.println("Nom : " + etudiant.getNom());
            System.out.println("Prenom : " + etudiant.getPrenom());
            System.out.println("Adresse : " + etudiant.getAdresse());
            System.out.println("Telephone : " + etudiant.getTel());
        }else {
            System.out.println("L'etudiant n'est pas en LIAGE3");
        }
        }

    }

