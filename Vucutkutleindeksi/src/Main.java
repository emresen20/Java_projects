import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen güncel kilonuzu giriniz");
        int kilo = scanner.nextInt();
        System.out.println("Lütfen güncel boyunuzu metre şeklinde giriniz (örneğin 1,76 veya 1,89");
        System.out.println("Virgül kullandığınıza emnin olunuz!!!");
        double boy = scanner.nextDouble();
        double vki = kilo/ (boy*boy);
        System.out.println("Vucut kitle endeksiniz : "+ vki);
                if(vki<18.5){
                    System.out.println("Zayıfsınız");
                    System.out.println("Ancak bu zayıflık bazı hastalıklara zemin hazırlayabileceği için istenmeyen bir durum olmaktadır. " +
                            "Normal vücut kitle indeksine sahip bir birey olarak kabul edilmek için yeterli ve dengeli beslenmeye özen gösterilmelidir. " +
                            "Aynı zamanda beslenme ile yeterli düzeyde alınamayan mikro besinler için de multivitamin kullanılabilmektedir.");
                    System.out.println("dengeli bir şekilde kilo almak içi şu linki ziyaret edebilirsiniz "+"" +
                            "https://vamooos.com/online/kilo-aldiran-yuksek-kalorili-besinler/");
                } else if (18.5 <= vki && vki<25) {
                    System.out.println("Kilonuz gayet Normal");
                    System.out.println("Spor yapıp kilonuzu koruyabilirsiniz"+"isterseniz egefitnes youtube kanalından fitness hakkında tavsiyeler alabilirsiniz");

                } else if (25<=vki && vki<30) {
                    System.out.println("Kilolusunuz ");
                    System.out.println("Güzel bir diyet ve antrenman programı ile normal kilonuza inebilirsiniz");
                    System.out.println("Bunun için şu siteyi ziyaret edebilirsiniz: https://www.drozdogan.com/zayiflamak-isteyenler-icin-kanita-dayali-23-ipucu/");


                    
                }
                else{
                    System.out.println("Obezsiniz");
                    System.out.println("Acilen bir diyetisyene gidip kilo vermeye başlamalısınız"+
                            "aksi halde ileride çok ciddi sağlık problemleri ile karşı karşıya kalabilirsiniz");
                }


    }
}