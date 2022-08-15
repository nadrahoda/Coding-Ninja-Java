/**
 * Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */

import java.util.Scanner;
public class Inverted_Number_Pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        int i = 1;
        while(i<=N){
            int j = 1;
            while(j<=N-i+1){
                System.out.print(N-i+1);
                j++;
            }
            System.out.println();
            i++;
        } 
    }
}