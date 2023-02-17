/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author emree
 */
public class Minihesapmakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String islemler = ("1 . Toplama islemi\n"
               +"2. Çıkarma islemi  \n"+
               "3. Çarpma islemi\n"+
               "4.Bölme istlemi ");
       System.out.println(islemler);
       System.out.println("İslem seciniz");
       String islem = scanner.nextLine();
       int a;
       int b;
        switch (islem) {
            case "1":
            System.out.println("Birinci sayiyi giriniz :");
             a = scanner.nextInt();
            System.out.println("İkinci sayiyi giriniz: ");
             b = scanner.nextInt();
            System.out.println("Toplam :  "+(a+b);
                
              break;
            case "2":
             System.out.println("Birinci sayiyi giriniz :");
             a = scanner.nextInt();
            System.out.println("İkinci sayiyi giriniz: ");
             b = scanner.nextInt();
            System.out.println("Fark "+(a-b);
            break;
            case "3":
                        System.out.println("Birinci sayiyi giriniz :");
             a = scanner.nextInt();
            System.out.println("İkinci sayiyi giriniz: ");
             b = scanner.nextInt();
            System.out.println("Çarpım "+(a*b);
            break;
            
            case "4":
                         System.out.println("Birinci sayiyi giriniz :");
            a = scanner.nextInt();
            System.out.println("İkinci sayiyi giriniz: ");
             b = scanner.nextInt();
            System.out.println("Bölüm:  "+((double)a/b);
            break;
                    
            default :
                   System.out.println("geçerli işlem girmediniz");
          
        }
       
    }
    
}
