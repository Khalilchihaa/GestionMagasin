package TestStatic;

public class Test {

    public static void main(String[] args) {
        Pesronne p1=new Pesronne();
        System.out.println("Le nombre :"+Pesronne.getComp());
        Pesronne p2=new Pesronne(3);
        System.out.println("Le nombre :"+Pesronne.getComp());
        Pesronne p3=new Pesronne(4,"ben ");
        System.out.println("Le nombre :"+Pesronne.getComp());

    }
}
