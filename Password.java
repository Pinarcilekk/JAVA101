import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        String username, password;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Kullanıcı adınız: ");
        username = inp.nextLine();
        
        System.out.print("Şifreniz: ");
        password = inp.nextLine();
        
        if (password.equals("1234")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.print("Şifre yanlış, sıfırlamak ister misiniz? (Evet=1 veya Hayır=0 basın): ");
            int sifirlama = inp.nextInt();
            inp.nextLine(); 
            
            if (sifirlama == 1) {
                System.out.print("Yeni şifreyi giriniz: ");
                String password2 = inp.nextLine();
                
                if (password2.equals("1234") || password2.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }
        
        inp.close();
    }
}
