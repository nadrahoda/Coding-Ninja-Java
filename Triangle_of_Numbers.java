/* Print the following pattern for the given number of rows.
Pattern for N = 4

The dots represent spaces.

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines */


import java.util.Scanner;
public class Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i, j, num = 1, space;
        
        space = n-1;
        
        for(j=1; j<=n; j++){
            num = j;
            for(i=1; i<=space; i++)
                System.out.print(" ");
            space --;
            
            for(i=1; i<=j; i++){
                System.out.print(num);
                num++;
            }
            num--;
            num--;
            for(i=1; i<j; i++){
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
