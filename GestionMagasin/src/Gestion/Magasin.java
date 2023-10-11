package Gestion;

import Entite.Produit;
import Gestion_Employee.Employe;
import Gestion_Employee.Responsable;

public class Magasin {
    private int identifiant;
    private String nom;
    private String adresse;

    private static final int CAPACITE_PR = 50;

    private Produit[] tabprod = new Produit[CAPACITE_PR];
    private Employe[] tabemp = new Employe[20];
    private int totalemp;


    private int comp;
    private static int totalPr;


    public Magasin(int id, String nom, String ad) {
        this.identifiant = id;
        this.nom = nom;
        adresse = ad;
    }

    public void ajouterProduit(Produit p) {
        if (!chercherPro(p)) {
            if (totalPr < tabprod.length) {
                tabprod[comp] = p;
                totalPr++;
                comp++;
            } else {

                System.out.println("Magasin plein");
            }
        } else {

            System.out.println("le produit existe");
        }
    }


    /*public  void ajouter(Produit p)
    {if(chercherPro(p)==false){
        if(comp<CAPACITE_PR){
       tabprod[comp]=p;
       comp++;
       totalPr++;}
        else{

            System.out.println("Magasin plein");
        }}
        else {

        System.out.println("le produit existe");
    }
    }*/
    public void ajouter_emp(Employe e) {

        if (comp < 20) {
            tabemp[comp] = e;
            comp++;
            totalemp++;
        } else {

            System.out.println("Dépasser nombre d employees ");
        }
    }

    public void afficher() {
        System.out.println("id :" + identifiant + "adresse :" + adresse);

        /*for (Entite.Produit p:tabprod) {
            if(p!=null)
            p.afficher();
        }*/
        for (int i = 0; i < comp; i++)
            if (this.tabprod[i] != null) {
                System.out.println(this.tabprod[i].toString());
            }
        for (int i = 0; i < comp; i++)
            if (this.tabemp[i] != null) {
                System.out.println(this.tabemp[i].toString());
            }
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean chercherPro(Produit p) {

        for (int i = 0; i < comp; i++) {
            if (Produit.comparer(p, tabprod[i]))
                return true;
        }
        return false;
    }

    public Magasin plusProduit(Magasin m1) {

        if (this.comp > m1.comp)
            return this;
        else if (this.comp < m1.comp)
            return m1;
        return null;
    }

    public static Magasin plusProduit(Magasin m1, Magasin m2) {

        if (m2.comp > m1.comp)
            return m2;
        else if (m2.comp < m1.comp)
            return m1;
        return null;
    }


    public String toString() {

        String str = "L'ensemble des produits :\n";

        for (int i = 0; i < comp; i++)
            str += tabprod[i] + "\n";

        return "identifiant" + identifiant + "adresse " + adresse + str;
    }

    public int search(Produit p) {

        for (int i = 0; i < comp; i++) {
            if (p.comparer(tabprod[i]))
                return i;
        }
        return -1;
    }

    public boolean supprimer(Produit p) {

        int indic = search(p);
        if (indic == -1) return false;
        for (int i = indic; i < comp; i++)
            tabprod[i] = tabprod[i + 1];
        tabprod[comp] = null;
        comp--;
        return true;
    }
    public void afficheNombreEmployesParType() {
        int nombreEmployesNormaux = 0;
        int nombreResponsables = 0;

        for (Employe employe : tabemp) {
            if (employe instanceof Responsable) {
                nombreResponsables++;
            } else {
                nombreEmployesNormaux++;
            }
        }
        System.out.println("Nombre d'employés normaux : " + nombreEmployesNormaux);
        System.out.println("Nombre de responsables : " + nombreResponsables);
    }
    public void afficheSalaires() {

        for (int i = 0; i < comp; i++)
            if (this.tabemp[i] != null) {
                System.out.println(this.tabemp[i].getNom() + " : " + this.tabemp[i].calculersalaire());


            }
    }
}
