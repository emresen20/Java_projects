
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz ....");
        System.out.println("Çıkış için q ya basın");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Hangi Beyblade üretmek istiyorsunuz? ");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
                
            }
            else{
                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if (beyblade == null){
                    System.out.println("Lütfen geçerli bir işlem giriniz");
                }
                else {
                    beyblade.bilgilerigoster();
                    beyblade.saldir();
                    beyblade.kutsalcanavarortayacikar();
                }
            }
        }
        
    }
    
}
