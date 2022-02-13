
package datatype_fundamentalprogramming;
import java.util.Scanner;
/**
 *
 * @author Zacky Faishal Abror
 * @version 1.0
 * @since 13-2-2022
 */
public class DataType_FundamentalProgramming{
     
    public static void main(String[] args) {
        //Kamus Data//
        int count;
        long N;

        //Algoritma//
        Scanner input = new Scanner(System.in);
        count = input.nextInt(); 
        
        for(int counter = 0; counter < count; counter++){
            try{
                N = input.nextLong();
                System.out.println(N + " can be fitted in:");
                if(N>=Byte.MIN_VALUE && N<= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(N>=Short.MIN_VALUE && N<= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(N>=Integer.MIN_VALUE && N<= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(N>=Long.MIN_VALUE && N<= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e){
                System.out.println(input.next() + " can't be fitted anywhere.");
            }
        }              
    }    
}
