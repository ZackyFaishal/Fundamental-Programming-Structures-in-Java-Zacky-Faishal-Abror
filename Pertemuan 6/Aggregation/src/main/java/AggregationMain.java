
import java.util.*;
/**
 *
 * @author Zacky Faishal Abror
 */
public class AggregationMain {

    public static void main(String[] args) {
        // Instance variables
        Day p1 = new Day("Senin", "1");
        Day p2 = new Day("Selasa", "2");
        Day p3 = new Day("Rabu", "3");
        Day p4 = new Day("Kamis", "4");
        Day p5 = new Day("Jumat", "5");
        Day p6 = new Day("Sabtu", "6");
        Day p7 = new Day("Minggu", "7");
        
        // Membuat List Anggota Month1
        List<Day> Month1 = new ArrayList<Day>();
        Month1.add(p1);
        Month1.add(p2);
        Month1.add(p3);
        
        // Membuat List Anggota MotoGP
        List<Day> Month2 = new ArrayList<Day>();
        Month2.add(p4);
        Month2.add(p5);
        Month2.add(p6);
        Month2.add(p7);
        
        Month hitungHari1 = new Month("Bulan1", Month1);
        Month hitungHari2 = new Month ("Bulan2", Month2);
        
        // Menampilkan Jumlah Pembalap
        System.out.println("========================================");
        System.out.println("Total Hari Pada  " + 
                hitungHari1.getnamaBulan() + " adalah " + hitungHari1.getTotalHari());
        System.out.println("========================================");
        System.out.println("Total Hari Pada " + 
                hitungHari2.getnamaBulan() + " adalah " + hitungHari2.getTotalHari());
        
    }
    
}
