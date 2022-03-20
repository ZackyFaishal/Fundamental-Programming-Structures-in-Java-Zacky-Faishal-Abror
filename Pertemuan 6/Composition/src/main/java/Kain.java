import java.util.*;
/**
 *
 * @author Zacky Faishal Abror
 */
public class Kain {
    private final List<Pakaian> pakaianKu;
    
    public Kain(List<Pakaian> pakaianKu) {
        this.pakaianKu = pakaianKu;
    }
    
    public List<Pakaian> getTotalKain(){
        return pakaianKu;
    }
}