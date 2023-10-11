package TestAssociation;

public class Projet {
    String name;

    Developpeur dev;

    public Projet(String name)
    {

        this.name=name;
    }
    public Projet(String nam,Developpeur d)
    {

        this.name=nam;
        dev=d;
    }
    public String toString()
    {
        return "name :"+name+" dev :"+dev;
    }
}
