package maestermap;
import java.util.*;

public class MaesterMap 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int maps = 0, signs = 0;
        String map = "";
        String aux = "";
        String [] split = new String[signs];
        BinaryTree tree = new BinaryTree();
        //signs = sc.nextInt();
       // maps = sc.nextInt();
        
        
        for (int i = 0; i < 5; i++) 
        {
            map = sc.nextLine();
            System.out.println(map);
            tree.insert(i+1, map);   
        }
        
        Node raiz = tree.root;
        
        while(raiz != null)
        {
            if(raiz.character.indexOf("*") == -1)
                System.out.println("yes");
            
            raiz = raiz.left;   
        }
        
        while(raiz != null)
        {
            if(raiz.character.indexOf("*") == -1)
                System.out.println("yes");
            
            raiz = raiz.right;   
        }
        
        
    }
}
