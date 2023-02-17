/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ogrenci.harf.notu;

import java.util.Scanner;

/**
 *
 * @author emree
 */
public class OgrenciHarfNotu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Lütfen notunuzu giriniz:");
   int not= scanner.nextInt();
   if (not>=90){
       System.out.println("Harf Notunuz A");
   }
   else if (not>=80){
       System.out.println("Harf notunuz:B");
   }
   else if (not>=70){
       System.out.println("Harf Notunuz:C");
   }
   else {
       System.out.println("Harf notunuz: D ve kaldınız");
   }
    }
    
}
