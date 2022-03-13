package kasus2;

/**
 *
 * @author Zacky Faishal Abror
 */
    public class Restaurant {
        //Data yang dipakai pada saat program dijalankan
    private FoodMenu[] DaftarMenu;
    public static byte id=0;
    
    
    public FoodMenu[] getDaftarMenu() {
        return DaftarMenu;
    }

    public void setDaftarMenu(FoodMenu[] DaftarMenu) {
        this.DaftarMenu = DaftarMenu;
    }
    
    // Constructor
    public Restaurant() {
        DaftarMenu = new FoodMenu[10];
        for( int i=0; i<10; i++) {
            DaftarMenu[i] = new FoodMenu();
        }
    }
    
    // Behaviors / methods
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.DaftarMenu[id].setNama_makanan(nama);
        this.DaftarMenu[id].setHarga_makanan(harga);
        this.DaftarMenu[id].setStok(stok);
    }

    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(DaftarMenu[i].getNama_makanan() +"["
                        +DaftarMenu[i].getStok()+"]"+"\tRp. "+DaftarMenu[i].getHarga_makanan());
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(DaftarMenu[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void nextId(){
        id++;
    }
    
    public void pesanMakanan (String nama, int jumlahPesanan) {
        StokBaru(nama, jumlahPesanan);
    }
    
    public void StokBaru (String nama, int jumlahPesanan) {
        for( int i=0; i<10; i++) {
            if( nama.equals(DaftarMenu[i].getNama_makanan()) ) {
                DaftarMenu[i].setStok(DaftarMenu[i].getStok()-jumlahPesanan);
            }
        }
    }
}

