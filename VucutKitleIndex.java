import java.util.Scanner;
public class VucutKitleIndex {
    public static void main(String[] args) {
        float boy;
        float kilo;
        float vki;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");   
        boy = scanner.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz: ");   
        kilo = scanner.nextFloat();

        vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        scanner.close();
    }
}
