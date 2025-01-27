import java.util.Scanner;
public class DaireAlan{
    public static void main(String[]args){
        double r , mrkz,alan,pi;
        Scanner input=new Scanner(System.in);
        System.out.println("Daire Diliminin yarıçapını giriniz : ");
        r=input.nextInt();
        System.out.println("Daire diliminin merkez açısını giriniz : ");
        mrkz =input.nextInt();
        pi=3.14;
        alan=(pi*(r*r)*mrkz)/360;
        System.out.println("Daire Diliminin Alanı : "+alan);
    }
}
