/**
 *
 * @author Zacky Faishal Abror
 */
package inventori;
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public int getStok() {
        return stok;
    }
    
    public void addStok(int stok){
        //method untuk menambahkan stok
        this.stok += stok;
    }
public Barang(String kode, String nama, int stk) {
kode_barang = kode;
nama_barang = nama;
stok = stk;
}
}
