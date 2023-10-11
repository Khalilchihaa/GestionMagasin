package Gestion_Employee;

public class Employe {
    private int id;
    private String nom;
    private String adresse;
    private int heuresParMois;


    public Employe(int id, String nom, String adresse, int heuresParMois) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.heuresParMois = heuresParMois;
    }

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getHeuresParMois() {
        return heuresParMois;
    }
    public double calculersalaire(){
        return 0;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", heuresParMois=" + heuresParMois +
                '}';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && nom.equals(employe.nom);
    }
}