import java.util.Scanner;
public class Not{
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notu: ");
        mat=input.nextInt();
        System.out.println("Fizik notu: ");
        fizik=input.nextInt();
        System.out.println("Kimya notu: ");
        kimya=input.nextInt();
        System.out.println("Türkçe notu: ");
        turkce=input.nextInt();
        System.out.println("Tarih notu: ");
        tarih=input.nextInt();
        System.out.println("Müzik notu: ");
        muzik=input.nextInt();

        double ortalama=(double)(mat + fizik + kimya+ turkce + tarih + muzik)/6;
        System.out.println("ORTALAMA: "+ ortalama);
        if(ortalama > 60){
            System.out.println("Sınıfı Geçti ");
        }else{
            System.out.println("Sınıfta Kaldı ");
        }
    }
}