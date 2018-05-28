package monkfriends;
import java.util.*;

public class MonkFriends 
{
    public static void main(String[] args) 
    {
        BinaryTree tree = new BinaryTree();
        int cases = 0, N = 0, M = 0, sum = 0, candies = 0;
        Scanner sc = new Scanner(System.in); 
        
        cases = sc.nextInt();
        
        for (int i = 0; i < cases; i++) 
        {
            N = sc.nextInt();
            M = sc.nextInt();
            sum = N + M;
           // System.out.println("sum:" + sum);
           
            tree.insert(N);
            tree.insert(M);
            
            for (int j = 0; j < sum; j++)
            {
                candies = sc.nextInt();
                //System.out.println(tree.search(candies));
                if(tree.search(candies) == null)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            tree.inOrderPrint(tree.root);
            tree.root = null;
        }
        
    }
}
