package Test;

import Entite.Produit;
import Execption.MagasinPleinException;
import Gestion.Magasin;
import Gestion_Employee.Caissier;
import Gestion_Employee.Responsable;
import Gestion_Employee.Vendeur;

import java.util.Date;
public class Test {

    public static  void main(String [] arg ) throws MagasinPleinException {
        Produit p1=new Produit();

        System.out.println("identifiant :"+p1.getIdentifiant());
        System.out.println("marque :"+p1.getMarque());
        System.out.println("libelle :"+p1.getLibelle());
        System.out.println("prix :"+p1.getPrix());

        Produit p2=new Produit(1024,"Delice","Lait");
        System.out.println("Entite.Produit 2");
        System.out.println("identifiant :"+p2.getIdentifiant());
        System.out.println("marque :"+p2.getMarque());
        System.out.println("libelle :"+p2.getLibelle());
        System.out.println("prix :"+p2.getPrix());

        Produit p3=new Produit(2510,"Vitalait","Yaourt");
        System.out.println("Entite.Produit 3");
        System.out.println("identifiant :"+p3.getIdentifiant());
        System.out.println("marque :"+p3.getMarque());
        System.out.println("libelle :"+p3.getLibelle());
        System.out.println("prix :"+p3.getPrix());
        Produit p4=new Produit(3250,"Sicam","Tomate",1.2f );

        ;

        System.out.println("afficher");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();

        p1.setMarque("Delice");
        System.out.println("to String");

        System.out.println(p1.toString());
        System.out.println(p1);

        System.out.println(p2.toString());

        System.out.println(p2);
        Date d1=new Date();
        p2.setDateexp(d1);
        System.out.println("to String");
        System.out.println(p2.toString());
        System.out.println(p2);
         p2.afficher();
        Produit p5=new Produit(12,"delic",d1);
        System.out.println(p5);



        /////////////////////////////////////
        Magasin magasin1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6");
        //ajouter produits
        magasin1.ajouterProduit(p1);
        magasin1.ajouterProduit(p2);
        magasin1.ajouterProduit(p3);
        magasin1.ajouterProduit(p4);
        magasin2.ajouterProduit(p1);
        magasin2.ajouterProduit(p2);
        magasin2.ajouterProduit(p3);
        magasin2.ajouterProduit(p4);

        // Créer des employés pour le premier magasin
        Caissier caissier1 = new Caissier(1, "Caissier 1", "Adresse 1", 160);
        Vendeur vendeur1 = new Vendeur(2, "Vendeur 1", "Adresse 2", 160, 0.15);
        Responsable responsable1 = new Responsable(3, "Responsable 1", "Adresse 3", 160, 100.0);
        // Créer des employés pour le deuxième magasin
        Caissier caissier2 = new Caissier(4, "Caissier 2", "Adresse 4", 180);
        Vendeur vendeur2 = new Vendeur(5, "Vendeur 2", "Adresse 5", 180, 0.20);
        Vendeur vendeur3 = new Vendeur(6, "Vendeur 3", "Adresse 6", 180, 0.18);
        Responsable responsable2 = new Responsable(7, "Responsable 2", "Adresse 7", 180, 120.0);
        // Ajouter des employés aux magasins
//////////////////////////////
        magasin1.ajouter_emp(caissier1);
        magasin1.ajouter_emp(vendeur1);
        magasin1.ajouter_emp(responsable1);

        magasin2.ajouter_emp(caissier2);
        magasin2.ajouter_emp(vendeur2);
        magasin2.ajouter_emp(vendeur3);
        magasin2.ajouter_emp(responsable2);
        magasin1.afficher();
        magasin2.afficher();
        System.out.println(caissier1.equals(caissier2));
        System.out.println(responsable1.calculersalaire());
        magasin1.afficheSalaires();
        magasin2.afficheNombreEmployesParType();

    }

}
