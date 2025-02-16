import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Armut kaç kilo ? : ");
        int armut=scanner.nextInt();
        System.out.println("Elma kaç kilo ? : ");
        int elma=scanner.nextInt();
        System.out.println("Domates kaç kilo ? : ");
        int domates=scanner.nextInt();
        System.out.println("Muz kaç kilo ? : ");
        int muz=scanner.nextInt();
        System.out.println("Patlıcan kaç kilo ? : ");
        int patlıcan=scanner.nextInt();
        armut*=2.14;
        elma*=3.67;
        domates*=1.11;
        muz*=0.95;
        patlıcan*=5.0;
        float toplam=armut + elma + domates + muz + patlıcan;
        System.out.println("Toplam Tutar: "+ toplam+" TL");
        scanner.close();
    }
}
