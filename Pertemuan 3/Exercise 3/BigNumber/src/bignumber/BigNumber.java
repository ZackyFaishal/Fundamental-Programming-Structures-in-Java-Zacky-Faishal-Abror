/**
 * Big Number
 * @author Zacky faishal Abror
 * 20 Februari 2022
 * Version 1
 */
package bignumber;

import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        //kamus data
        int angka1,angka2;
        BigInteger hasilPertambahan,hasilPerkalian;
        
        //Algoritma
        Scanner input= new Scanner(System.in); 
        angka1 = input.nextInt(); 
        angka2 = input.nextInt(); 
        hasilPertambahan = BigInteger.valueOf(angka1 + angka2); 
        hasilPerkalian = BigInteger.valueOf(angka1 * angka2);
        
        System.out.println(hasilPertambahan);
        System.out.println(hasilPerkalian); 
    
}
}