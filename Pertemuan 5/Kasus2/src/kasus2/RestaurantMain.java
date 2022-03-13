package kasus2;
/**
 *
 * @author Zacky Faishal Abror
 */
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
          Restaurant menu = new Restaurant();
        System.out.println("====STOK ASAL====");
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        System.out.println();
        
        System.out.println("====PESANAN====");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah pesanan Bala-Bala:");
        int jumlahB = input.nextInt();
        menu.pesanMakanan("Bala-Bala", jumlahB);
        System.out.println("Masukkan jumlah pesanan Gehu:");
        int jumlahG = input.nextInt();
        menu.pesanMakanan("Gehu", jumlahG);
        System.out.println("Masukkan jumlah pesanan Molen:");
        int jumlahM = input.nextInt();
        menu.pesanMakanan("Molen",jumlahM);
        System.out.println("Masukkan jumlah pesanan Tahu:");
        int jumlahT = input.nextInt();
        menu.pesanMakanan("Tahu", jumlahT);
        int total = (jumlahG+jumlahB+jumlahM+jumlahT)*1000;
        System.out.println("Jumlah Harga yang perlu dibayar: Rp"+total);
        System.out.println();
        System.out.println();
        
        System.out.println("====STOK TERBARU====");
        menu.tampilMenuMakanan();
    }
}

