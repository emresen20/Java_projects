import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        String sys_kullanici_adi = "Emre Sen";
        String sys_parola = "123456789asd";
        System.out.println("******************************************");
        System.out.println("*********************************************");
        System.out.println("Kullanici girişine HOŞGELDİNİZ");
        while (true) {
            System.out.println("Kullanıcı adı :  ");
            String kullanici = scanner.nextLine();
            System.out.println("Parola :  ");
            String parola = scanner.nextLine();
            if (sys_kullanici_adi.equals(kullanici) && sys_parola.equals(parola)) {
                System.out.println("HOŞGELDİNİZ  " +
                        kullanici);
                break;

            } else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Parolanız yanlış lütfen tekrar deneyiniz");
                giris_hakki -= 1;
                System.out.println("giriş hakkı : " + giris_hakki);

            } else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Kullanıcı adınız  yanlış lütfen tekrar deneyiniz");
                giris_hakki -= 1;
                System.out.println("giriş hakkı : " + giris_hakki);
            } else {
                System.out.println("Kullanıcı adınız ve parolanız yanlış");
                giris_hakki -= 1;
                System.out.println("giriş hakkı : " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giriş hakkınız bitti yöneticiyi arayınız 05511033820");
                break;


            }
        }
    }
}