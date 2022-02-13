package strings_fundamentalprograming;
import java.util.Scanner;
/**
 * @author Zacky Faishal Abror
 * @version 1.0
 * @since 13-2-2022
 */
public class Strings_FundamentalPrograming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        try{
            System.out.println(A.length()+ B.length());
            int result = A.compareTo(B);
            if ((result < 0 )){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
            System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1)); // untuk menampilkan huruf besar dari awalan dua string//
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
