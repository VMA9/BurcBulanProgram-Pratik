import java.util.Scanner;

public class BurcBulanProgramPratik {
    public static void main(String[] args) {
        int month, day;
        String burc = "";


        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz Ayı Giriniz : ");
        month = input.nextInt();
        System.out.print("Doğdunuz Günü Giriniz : ");
        day = input.nextInt();

        if ((day >= 32 || 0 >= day) || (month >= 13 || month <= 0)) {
            System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz !");
        } else {
            if ((month == 1 && day > 21) || (month == 2 && day < 20)) {
                burc = "Kova !";
            } else if ((month == 2 && day > 19) || (month == 3 && day < 21)) {
                burc = "Balık !";
            } else if ((month == 3 && day > 20) || (month == 4 && day < 21)) {
                burc = "Koç !";
            } else if ((month == 4 && day > 20) || (month == 5 && day < 22)) {
                burc = "Boğa !";
            } else if ((month == 5 && day > 21) || (month == 6 && day < 23)) {
                burc = "İkizler !";
            } else if ((month == 6 && day > 22) || (month == 7 && day < 23)) {
                burc = "Yengeç !";
            } else if ((month == 7 && day > 22) || (month == 8 && day < 23)) {
                burc = "Aslan !";
            } else if ((month == 8 && day > 22) || (month == 9 && day < 23)) {
                burc = "Başak !";
            } else if ((month == 9 && day > 22) || (month == 10 && day < 23)) {
                burc = "Terazi !";
            } else if ((month == 10 && day > 22) || (month == 11 && day < 22)) {
                burc = "Akrep !";
            } else if ((month == 11 && day > 21) || (month == 12 && day < 22)) {
                burc = "Yay !";
            } else if ((month == 12 && day > 21) || (month == 1 && day < 22)) {
                burc = "Oğlak !";
            }
        }System.out.print("Burcunuz : " + burc);


    }


}