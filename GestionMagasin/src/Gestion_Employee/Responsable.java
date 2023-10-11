package Gestion_Employee;

public class Responsable extends Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int heuresParMois, double prime) {
        super(id, nom, adresse, heuresParMois);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }
    public double calculersalaire(){
        double salaire= 0;
        if(this.getHeuresParMois() <160){
            salaire = (this.getHeuresParMois() +10) +this.prime;
        }else {
            salaire = 1600 + prime +((this.getHeuresParMois()-160*2));
        }
        return salaire;
    }
}


