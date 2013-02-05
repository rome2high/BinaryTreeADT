import javax.swing.*;

public class BinaryTreeApplication {
	public static void main(String[] args) {
		JFrame frame = new JFrame("BinaryTreeApplication");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new LayoutPanel());
		frame.pack();
		frame.setVisible(true);
	}
}