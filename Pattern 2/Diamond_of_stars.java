/*
 * Diamond_of_stars
 Print the following pattern for the given number of rows.
Note: N is always odd.
Pattern for N = 5
The dots represent spaces.

Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
 */

import java.util.Scanner;
public class Diamond_of_stars {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int n1 = (n+1)/2;
        int n2 = n/2;
        
        int row = 1;
        while(row<=n1){
            int spaces = 1;
            while(spaces<=n1-row){
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while(stars<=(2*row-1)){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            row++;
        }
        row=1;
        int rownumber = n2;
        while(row<=n2){
            int spaces = 1;
            while(spaces<=n2-rownumber+1){
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while(stars<=2*rownumber-1){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            row++;
            rownumber--;
        }
       
    }
}