import Execption.PrixNegatifException;

import java.util.Date;
public class Produit {

    int identifiant;
    String libelle,marque;

    float prix;

   Date dateexp;
    public Produit(int id,String marque,String lb)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lb;
    }

    public Produit(int id,String marque,String lib,float prix) throws PrixNegatifException
    {
        identifiant=id;
        this.marque=marque;
        libelle=lib;
        if (prix > 0) {
            this.prix = prix;
        } else {
            throw new PrixNegatifException("Le prix est négatif");
        }
        this.dateexp = new Date();
    }
    public Produit(){}

    public Produit(int id,String mar)
    {
        identifiant=id;
        marque=mar;
    }
    public Produit(int id,String mar,Date da)
    {
        identifiant=id;
        marque=mar;
        dateexp=da;
    }
    public Produit(String lib,int id){

        identifiant=id;
        libelle=lib;
    }

    public void afficher()
    {
        System.out.println("L'indentifiant :"+identifiant+" marque :"+
                marque+" libelle :"+libelle+" prix :"+prix);
    }
    
    public String toString()
    {

        return ("L'indentifiant :"+identifiant+" marque :"+
                marque+" libelle :"+libelle+" prix :"+prix+" Date exp :"+dateexp);
    }
}
