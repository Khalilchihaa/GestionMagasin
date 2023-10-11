package Gestion_Employee;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int heuresParMois) {
        super(id, nom, adresse, heuresParMois);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }
    public double calculersalaire() {
        double salaire = 0;
        if (this.getHeuresParMois() <= 180) {
            salaire = (this.getHeuresParMois() * 5);
        } else {
            salaire = 1800 * ((this.getHeuresParMois() - 180) * 1.5);
        }
        return salaire;
    }
}