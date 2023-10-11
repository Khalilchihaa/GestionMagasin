package Gestion_Employee;

public class Vendeur extends Employe {
    private double tauxDeVente;

    public  Vendeur (int id, String nom, String adresse, int heuresParMois, double tauxDeVente) {
        super(id, nom, adresse, heuresParMois);
        this.tauxDeVente = tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }
    public double calculersalaire(){
        return 450* this.tauxDeVente;
    }
}
