/**
 *
 * @author Zacky Faishal Abror
 */
public class Pakaian {
    // Attributes
    private String jenisPakaian;
    private String namaPakaian;
    
    // Constructor
    public Pakaian(String namaPakaian, String jenisPakaian) {
        this.namaPakaian = namaPakaian;
        this.jenisPakaian = jenisPakaian;
    }
    
    public String getnamaPakaian() {
        return this.namaPakaian;
    }
    
    public String getjenisPakaian(){
        return this.jenisPakaian;
    }
}