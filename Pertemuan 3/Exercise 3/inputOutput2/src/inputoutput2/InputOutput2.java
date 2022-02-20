package inputoutput2;
/**
 * Input Output 2
 * @author Zacky faishal Abror
 * 17 Februari 2022
 * Version 1
 */

import java.util.Scanner;

public class InputOutput2 {

    public static void main(String[] args) {
     String s;
     int i,n;
     // Array string
     String[] huruf= new String [3];
     //Array integer
     int[] angka=new int[3]; 
     //inputan
     Scanner sc = new Scanner(System.in);
     for (i=0;i<3;i++){
         s = sc.next();
         huruf[i]=s;
         n = sc.nextInt();
         angka[i]=n;
     }
     //print out
     System.out.println("================================");
     for (i=0;i<3;i++){
     System.out.printf("%-15s %03d%n",huruf[i],angka[i]);
     }
     System.out.println("================================");    
     }
}

