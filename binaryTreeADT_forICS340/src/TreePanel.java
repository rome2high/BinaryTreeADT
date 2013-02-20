import javax.swing.*;
import java.awt.*;

public class TreePanel extends JPanel{
	private final int WIDTH = 440;
	private final int HEIGHT = 380;
	private int yInc=70;
	protected BinaryTree binaryTree;
	
	public TreePanel() {
		binaryTree = new BinaryTree();
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.GREEN);
	}
	
	public void insertNode(int e) {
		binaryTree.addNode(e);
	}
	
	public void clear() {
		binaryTree = new BinaryTree();
	}
	
	//help method that is used by addNode method.
	private int maxNodesInLevel(int level){
		return (int)Math.pow(2.0, level);
	}
	
	public void paintComponent(Graphics g){
		//pre-process: input all the nodes into a queue (outputQueue) for easy output
		super.paintComponent(g);
		int e;
		int i = 0;
		String str = "";
		BTNode n;
		Queue outputQueue = new Queue();
		Queue q1 = new Queue(); //used to achieve level by level access of the tree
		Queue q2 = new Queue();
		if(!binaryTree.queue.isEmpty()){
			for(i=0; i<binaryTree.queue.numOfNodes; i++){
				q1.enque(binaryTree.queue.data[i]);			//add tree to queue (rmai)
			}//for
			while(!q1.isEmpty()||!q2.isEmpty()){
				if(!q1.isEmpty()){
					while(!q1.isEmpty()){
						n = (BTNode)q1.deque();
						if(n.getLeft()!=null){				//Fail at this line. null-exception
							q2.enque(n.getLeft());
						}
						if(n.getRight()!=null){
							q2.enque(n.getRight());
						}
						outputQueue.enque(n);	
					}
				}
				if(!q2.isEmpty()){
					while(!q2.isEmpty()){
						n = (BTNode)q2.deque();
						if(n.getLeft()!=null){
							q1.enque(n.getLeft());
						}
						if(n.getRight()!=null){
							q1.enque(n.getRight());
						}
						outputQueue.enque(n);
					}
				}
				
				
			}//while
			

		}
		
		
		
		//output the tree in breadth first using one pass, taking all the nodes from the queue
		while(!outputQueue.isEmpty()){
			n = (BTNode)outputQueue.deque();
			e = n.element();
			str = str + e + "  ";
		} 
		g.drawString(str, 10, 100);
	}

}