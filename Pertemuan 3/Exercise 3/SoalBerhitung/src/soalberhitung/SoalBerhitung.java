package soalberhitung;

/**
 * Soal Berhitung
 * @author Zacky faishal Abror
 * 20 Februari 2022
 * Version 1
 */

import java.util.Scanner;

public class SoalBerhitung {
    public static void main(String[] args) {
    //kamus data
    char operator;
    int nomor1,nomor2,hasil;
    
    //Algoritma
    //inputan
    Scanner input = new Scanner(System.in);
    nomor1 = input.nextInt();
    operator = input.next().charAt(0);
    nomor2 = input.nextInt();
    
    //pengecekan operator
    if((nomor1>=1 && nomor2<=1000)&&(nomor2>=1&&nomor2<1000)){
        switch (operator){
            case '+'://penjumlahan
            hasil = nomor1 + nomor2;
            System.out.println(hasil);
            break;
            case '-'://pengurangan
            hasil = nomor1 - nomor2;
            System.out.println(hasil);
            break;
            case '*'://perkalian
            hasil = nomor1 * nomor2;
            System.out.println(hasil);
            break;
            case '/'://pembagian
            hasil = nomor1 / nomor2;
            System.out.println(hasil);
            break;
            case '%'://modulus
            hasil = nomor1 % nomor2;
            System.out.println(hasil);
            break;
        }
    }else {
        System.out.println("Angka yang dimasukan salah");
    }
    
    }
    
}