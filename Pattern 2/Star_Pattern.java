/**
 * Star_Pattern
 Print the following pattern Pattern for N = 4

The dots represent spaces.

Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
 */

import java.util.Scanner;
public class Star_Pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int space = N;
        int i = 0;
        int k = 1;
        int j = 0;
        while(i<N){
            while(k<space){
                System.out.print(" ");
                k++;
            }
            
            while(j<=i*2){
                System.out.print("*");
                j++;
            }
            j=0;
            k=1;
            i++;
            space--;
            
            System.out.println();
            
        }
    }
}
