import java.util.*;
/**
 *
 * @author Zacky Faishal Abror
 */
public class Month {
    // Attributes
    private String namaBulan;
    private List <Day> daftarHari;
    
    // Constructor
    public Month (String namaBulan, List<Day> daftarHari ) {
        this.namaBulan = namaBulan;
        this.daftarHari = daftarHari;
    }
    
    // Methods
    public String getnamaBulan() {
        return this.namaBulan;
    }
    
    public int getTotalHari() {
        int jumlahHari=0;
        
        for(Day p : daftarHari) {
            jumlahHari++;
        }
        return jumlahHari;
    }
}