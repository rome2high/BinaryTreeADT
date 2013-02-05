public class BTNode {
	protected int element, x, y, px, py, level;
	protected BTNode left, right, parent;
		
	public BTNode(){
		element = -1;
		x = -1;
		y = -1;
		px = -1;
		py = -1;
		level = -1;
		parent = null;
		left = null;
		right = null;
	}
	
	public BTNode(int e){
		element = e;
		x = -1;
		y = -1;
		px = -1;
		py = -1;
		level = -1;
		parent = null;
		left = null;
		right = null;
	}
		
	public int element(){
		return element;
	}
		
	public void setElement(int e){
		element = e;
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int aX){
		x = aX;
	}
		
	public int getY(){
		return y;
	}
	
	public void setY(int aY){
		y = aY;
	}
	
	public int getPX(){
		return px;
	}
	
	public void setPX(int aPX){
		px = aPX;
	}
	
	public int getPY(){
		return py;
	}
	
	public void setPY(int aPY){
		py = aPY;
	}
	
	public int getLevel(){
		return level;
	}
		
	public void setLevel(int l){
		level = l;
	}
		
	public BTNode getParent(){
		return parent;
	}
	
	public void setParent(BTNode node){
		parent = node;
	}
	
	public BTNode getLeft(){
		return left;
	}
		
	public void setLeft(BTNode node){
		left = node;
	}
		
	public BTNode getRight(){
		return right;
	}
		
	public void setRight(BTNode node){
		right = node;
	}
}