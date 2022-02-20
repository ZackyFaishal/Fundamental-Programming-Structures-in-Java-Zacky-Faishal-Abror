/**
 * @author Zacky faishal Abror
 * 17 Februari 2022
 * Version 1
 */
package soalinputoutput;

import java.util.Scanner;

public class SoalInputOutput {
static int n;
    public static void main(String[] args) {
        String S;
        Scanner input = new Scanner(System.in);
        S = input.nextLine();
        String[] temp = S.split ("[! ,.?_'@]+");
        n = temp.length;
        //print n
        System.out.println(n);
        // print token string
        for (int i=0;i<temp.length;i++){
        System.out.println(temp[i]);   
    }   
}
}
