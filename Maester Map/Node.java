package maestermap;

public class Node 
{
	int value;
        String character;
	
	//Apuntadores 
	Node right = null;
	Node left = null;
	
	public Node(int value, String character)
	{
		this.value = value;
                this.character = character;
	}
	
	
	public String toString()
	{
		return "" + this.value + " " + this.character + "\n"; 
	}
	
	public Node clone()
	{
		return new Node(this.value, this.character);
	}	
}