/* WAP to print a pattern like 
    *
    **
    ***
    ****
    *****
*/
import java.util.*;
public class star_pattern {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the square pattern:");
    int a=sc.nextInt();
    for (int i=0;i<a;i++) {
        for (int j=0;j<=i;j++) {
            System.out.print("*");
    }
    System.out.print("\n");
    
   } 
   sc.close();
}

    
}