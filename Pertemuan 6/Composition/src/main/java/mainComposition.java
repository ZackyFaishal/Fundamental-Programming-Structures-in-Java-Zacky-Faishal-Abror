import java.io.*;
import java.util.*;
/**
 *
 * @author Zacky Faishal Abror
 */
public class mainComposition {

    public static void main(String[] args) {
        // TODO code application logic here
        Pakaian p1 = new Pakaian ("Cardigan ", "Outer");
        Pakaian p2 = new Pakaian("Jaket", "Outer");
        Pakaian p3 = new Pakaian("Kemeja", "Outer");
        Pakaian p4 = new Pakaian("Kerudung", "Inner");
        
        List<Pakaian> pakaianKu = new ArrayList<Pakaian>();
        pakaianKu.add(p1);
        pakaianKu.add(p2);
        pakaianKu.add(p3);
        pakaianKu.add(p4);
      
        
        Kain katun = new Kain(pakaianKu);
        
        List<Pakaian> pkn = katun.getTotalKain();
        System.out.println("Pakaian yang membutuhkan kain adalah");
        for(Pakaian pl : pkn) {
            System.out.println("Nama Pakaian : " + pl.getnamaPakaian());
            System.out.println("Jenis Pakaian : " + pl.getjenisPakaian());
            System.out.println();
           
        }
    }
    
}