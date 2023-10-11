import Entite.Produit;

public class TestTableau {

    public static void main(String[] args) {
        int  []  tab=new int[2] ;
        tab[0]=12;
        tab[1]=15;

        for (int i=0;i<2;i++)
            System.out.println(tab[i]);

        int [] tab1={12,15,2};
        for(int i=0;i<tab1.length;i++)
            System.out.println(tab1[i]);

        for(int x:tab1)
            System.out.println(x);

        String [] tab2=new String[2];

        tab2[0]="test";
        tab2[1]="abc";

        for (String p1:tab2)
            System.out.println(p1);
        Produit [] tab3=new Produit[2];

        Produit p=new Produit();
        tab3[0]=p;

    }
}
