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
		setBackground(Color.ORANGE);
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
	
	public void paintComponent(Graphics g){//This version needs to be rewritten
		//pre-process: input all the nodes into a queue (outputQueue) for easy output
		super.paintComponent(g);
		int boundingBox = 24, e, x, y, px, py, xText, yText;
		BTNode n;
		Queue outputQueue = new Queue();  //this is one of those variables that is 
                                                                                             //useful when drawing the whole tree
		if(!binaryTree.isEmpty()){
			//draw root
			n = binaryTree.root();
			e = n.element();
			x = n.getX();
			x = x - boundingBox/2;  //do some minor adjusting
			y = n.getY();
			g.setColor(Color.black);
			g.fillOval(x, y, boundingBox, boundingBox);
			xText = x + boundingBox/3 - 5;
			yText = y + boundingBox/2 + 5;
			g.setColor(Color.white);
			g.drawString(e+"", xText, yText);
		} 
	}
}