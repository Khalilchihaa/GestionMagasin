package TestStatic;

public class Pesronne {
    int id;
    String nom;

   private static int comp;


   public static int getComp()
   {

       return comp;
   }
    public Pesronne()
    {
        comp++;
    }
    public Pesronne(int id)
    {

        this.id=id;
        comp++;
    }

    public Pesronne(int id,String n)
    {
        this.id=id;
        nom=n;
        comp++;
    }
}
