import java.sql.SQLOutput;
import java.util.Scanner;

// banka banka güncel faiz oranı ile para hesaplama
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("12 ay sonunda seçtiğiniz banka ile kazanacağınız para ");
        double akbank = 28;
        double ing = 27;
        double odeabank = 25;
        double nkolay = 27;
        double anadolubank = 27;
        double enpara =23;
        System.out.println("aşağıda banka banka faiz oranları verilmiştir:");
        System.out.println("akbank : " +akbank);
        System.out.println(" ing :"+ ing);
        System.out.println("odeabank: "+ odeabank);
        System.out.println("nkolay: "+ nkolay);
        System.out.println("anadolubank: "+ anadolubank);
        System.out.println("enpara "+enpara);

        System.out.println("Hangi bankayı tercih etmek istersiniz");
        System.out.println("akbank için 1");
        System.out.println("ing için 2 yi");
        System.out.println("odeabank için 3 ü ");
        System.out.println("nkolay için 4 ü");
        System.out.println("anadolubank için 5 e ");
        System.out.println("enpara için 6 ya basınız");
       int banka =scanner.nextInt();
        System.out.println("Lütfen anaparanızı giriniz:" );
        int  anapara = scanner.nextInt();
       switch (banka){
           case 1:
               double v = (28 * anapara / 100);
               System.out.println("12 ay sonunda toplam param " + (v+anapara));
               System.out.println("Aylık kazancınız : " + (v/12));
               break;
           case 2:
               double z = (27 * anapara / 100);
               System.out.println("12 ay sonunda toplam param " + (z+anapara));
               System.out.println("Aylık kazancınız : " + (z/12));
               break;
           case 3:
               double o = (25 * anapara /100);
               System.out.println("12 ay sonunda toplam param " + (o+anapara));
               System.out.println("Aylık kazancınız : " + (o/12));
               break;
           case 4:
               double y = (27*anapara/100);
               System.out.println("12 ay sonunda toplam param " + (y+anapara));
               System.out.println("Aylık kazancınız : " + (y/12));
               break;
           case 5:
               double p = (27*anapara/100);
               System.out.println("12 ay sonunda toplam param " + (p+anapara));
               System.out.println("Aylık kazancınız : " + (p/12));
               break;
           case 6:
               double t= (enpara*anapara/100);
               System.out.println("12 ay sonunda toplam param " + (t+anapara));
               System.out.println("Aylık kazancınız : " + (t/12));
               break;
           default:
               System.out.println("Kayıtlı bir değer giremediniz lütfen listeyi iyice tarayıp tekrar deneyiniz");
               break;





       }






    }
}