package bukatutupjalan;
/**
 * Buka Tutup Jalan
 * @author Zacky faishal Abror
 * 20 Februari 2022
 * Version 1
 */
import java.util.Scanner;
public class BukaTutupJalan {
    public static void main(String[] args) {
       //kamus data
      String angka;
      long ubahAngka;
   
      //Algoritma
         Scanner input = new Scanner(System.in);
         angka = input.nextLine();
         angka = angka.replaceAll("\\s", "");
         
          ubahAngka=Long.parseLong(angka);
          
          ubahAngka=ubahAngka-999999;
          
          if(ubahAngka%5 !=0){
              System.out.println("jalan");
          }
          else {
              System.out.println("berhenti");
          }
    }
    
}
