import java.util.Scanner;
/**
 * Print the following pattern for the given N number of rows.
Pattern for N = 4

The dots represent spaces.

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines
 */
public class Mirror_Image_Number_Pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        int i = 1;
        while(i<=N){
            int j = 1;
            while(j<=N-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}