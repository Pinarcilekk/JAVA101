import java.util.Scanner;

public class KDV{
    public static void main(String[]args){
        double tutar,kdvFiyat,kdvTutar;
Scanner input=new Scanner(System.in);
System.out.println("Tutarı giriniz: ");
tutar=input.nextInt();
if(tutar >1000){
    kdvFiyat=tutar+(tutar*0.08);
    kdvTutar=kdvFiyat - tutar;
}else{
    kdvFiyat=tutar+(tutar*0.18);
    kdvTutar=kdvFiyat - tutar;
}
System.out.println("KDV'siz Fiyat = "+tutar);
System.out.println("KDV'li Fiyat = "+kdvFiyat);
System.out.println("KDV tutarı = "+kdvTutar);
    }

}