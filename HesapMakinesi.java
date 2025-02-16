import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("İlk sayı: ");
        int n1=scanner.nextInt();
        System.out.println("İkinci sayı: ");
        int n2=scanner.nextInt();
        System.out.println("Hangi işlem : 1-Toplama  2-Çıkarma 3-Çarpma  4-Bölme ");
        System.out.println(": ");
        int secim=scanner.nextInt();

        switch(secim){
            case 1: System.out.println("Toplam: "+(n1 + n2));break;
            case 2: System.out.println("Çıkarma: "+(n1 - n2));break;
            case 3: System.out.println("Çarpma: "+(n1 * n2));break;
            case 4: System.out.println("Bölme: "+(n1 / n2));break;    
        }
        scanner.close();
        
    }
}
