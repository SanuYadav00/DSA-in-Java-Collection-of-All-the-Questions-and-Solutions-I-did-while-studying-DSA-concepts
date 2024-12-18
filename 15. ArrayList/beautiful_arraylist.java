/* An Arraylist nums of size n is beautiful if:nums is a permutation of the integers in the range [1, n].
For every 0<=i<j<n, there is no index k with i<k<j where 2*nums.get(k)==nums.get(i)+nums.get(j).
Given the integer n, return any beautiful arraylist nums of size n. There will be atleast one valid 
answer for the given n.
Sample Input 1: n = 4
Sample Output 1:  [2,1,4,3]
Sample Input 2: n = 5
Sample Output 2:  [3,1,2,5,4]
Constraints:●1 <= n <= 100 */
import java.util.*;
import java.util.ArrayList;
public class beautiful_arraylist {
public static ArrayList<Integer> beauty(int n) {
  ArrayList<Integer> ans=new ArrayList<>();
  ans.add(1);
  for (int i=2;i<=n;i++) {
    ArrayList<Integer> temp=new ArrayList<>();
    for (Integer e:ans) {
      if (2*e<=n)temp.add(e*2);
    }
    for (Integer e:ans) {
      if (2*e-1<=n)temp.add(e*2-1);
    }
    ans=temp;

  }
  return ans;

}
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the size of ArrayList:");
  int n=sc.nextInt();
 System.out.println("The beautiful arraylist is:"+beauty(n));
 sc.close();

}
}

