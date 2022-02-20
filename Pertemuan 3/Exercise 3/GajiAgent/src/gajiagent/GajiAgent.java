package gajiagent;
/**
 * Gaji Agent
 * @author Zacky faishal Abror
 * 20 Februari 2022
 * Version 1
 */
import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        //kamus data
        int jumlahItem,bonus,gajiPokok,gajiTotal,hargaItem;
        gajiTotal=0;
        gajiPokok=500000;
        hargaItem=50000;
        bonus=0;
        //inputan
        Scanner input = new Scanner(System.in);
        jumlahItem = input.nextInt();
        if (jumlahItem>=40&&jumlahItem<=80){
            bonus=((25*jumlahItem*hargaItem)/100);
        }
        else if(jumlahItem>80){
            bonus=((35*jumlahItem*hargaItem)/100);
        }
        else if(jumlahItem>=15&&jumlahItem<40){
            bonus=((10*jumlahItem*hargaItem)/100);
        }
        else if(jumlahItem<15){
            jumlahItem=15-jumlahItem;
            bonus=((-15*jumlahItem*hargaItem)/100);
    }
        gajiTotal=gajiPokok+bonus;
        System.out.println(gajiTotal);
}
}
