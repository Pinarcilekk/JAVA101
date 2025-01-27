import java.util.Scanner;

public class Taksimetre{
    public static void main(String[]args){
        double km,tutar,sabit;
        Scanner input=new Scanner(System.in);
        System.out.println("kaç km yol aldınız ?: ");
        km=input.nextInt();
        tutar=(km * 2.20)+10;
        sabit=20.0;
        if(tutar<20){
            System.out.println("Ödenecek Tutar : "+ sabit +"₺");
        }else{
            System.out.println("Ödenecek Tutar : "+ tutar +"₺");
        }
    }
}