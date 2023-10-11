package Entite;

import java.util.Date;
public class Produit {

  private   int identifiant;
  private  String libelle,marque;

   private float prix;

   private Date dateexp;

   public void setPrix(float p)
   {
       if(p>0)
           prix=p;
       else System.out.println("le prix doît être postif");

   }
   public float getPrix()
   {

       return prix;
   }

    public Date getDateexp() {
        return dateexp;
    }

    public void setDateexp(Date dateexp) {
        this.dateexp = dateexp;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public Produit(int id, String marque, String lb)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lb;
    }

    public Produit(int id,String marque,String lib,float prix)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lib;
        this.prix=prix;
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
    public boolean comparer(Produit p)
    {
      if(this.identifiant==p.identifiant&&marque==p.marque&&this.prix==p.prix)
          return true;
      return false;
    }
    public static boolean comparer(Produit p1,Produit p2)
    {

        return p1.identifiant==p2.identifiant
                &&p1.marque==p2.marque&&p1.prix==p2.prix;

    }
}
