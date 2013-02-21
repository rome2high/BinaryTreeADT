import java.io.Console;

public class BinaryTree implements BinaryTreeADT {
	protected  BTNode  root;
	protected  int  size;
	protected Queue queue; //used to keep track of last node.
			    
	public BinaryTree(){
		root = null;
		size = 0;
		queue = new Queue();
	}
	
	public BTNode root(){
		if(!isEmpty())
			return  root;
		else return null;
	}
		
	public boolean isEmpty() {
		return (root == null);        
	}
			
	public int size() {return  size;}
		
	public boolean isRoot(BTNode v) {
		if(root == null)
			return false;
		else
			return  (v == root);
	} 

	public boolean hasParent(BTNode v) {
		if(v.getParent() == null)
		    return false;
		else return true;
	}
			    
	public BTNode parent(BTNode v){
		if(hasParent(v))
			return v.getParent();
		else return null;
	}

	public boolean isLeaf(BTNode v) {
		return (!hasLeft(v) && !hasRight(v));
	}
			
	public boolean hasLeft(BTNode v) {
		return  (v.getLeft() != null);
	}
		    
	public BTNode left(BTNode v){
		if(hasLeft(v))
			return v.getLeft();
		else return null;
	}

	public boolean hasRight(BTNode v) {
		return  (v.getRight() != null);
	}
		    
	public BTNode right(BTNode v){
		if(hasRight(v))
			return v.getRight();
		else return null;
	}
		
	public void addNode(int e) { 
	    	BTNode n = new BTNode(e);
	  	queue.enque(n); //insert n into queue; current node
	    	//finish the rest
	  		
	  		BTNode frontNode = (BTNode) queue.peek();		//front node (first to go out)
	  		
	  		BTNode lastNode = (BTNode) queue.data[queue.rear - 2];
	  		
	  	if(root == null){		//test if root exist
	  		root = n;
	  		n.level = 0;		//start off level\
	  	}
	  	else
	  	{
		  	n.parent = root;
		  	n.level = n.parent.level + 1;
		  	System.out.println(n.getParent());
	  	}
	  	
	  	//queue.deque();		//testing deque
	  	
	  	System.out.println(n.getParent());
	  	


	}         
}