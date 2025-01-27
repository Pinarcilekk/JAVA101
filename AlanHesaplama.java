import java.util.Scanner;

public class AlanHesaplama{
    public static void main(String[]args){
        double a,b,c,u,alanKare,alan;
        Scanner input=new Scanner(System.in);
        System.out.println("üçgenin 1. kenarını giriniz: ");
        a=input.nextInt();
        System.out.println("üçgenin 1. kenarını giriniz: ");
        b=input.nextInt();
        System.out.println("üçgenin 1. kenarını giriniz: ");
        c=input.nextInt();
        u=(a+b+c)/2;
        alanKare= u *(u - a)*(u - b)*(u - c);
        alan=Math.sqrt(alanKare);
        System.out.println("Kenarları verilen üçgenin alanı : "+ alan+" cm^2");
    }
}