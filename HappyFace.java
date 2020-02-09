import java.awt.Color;
import javax.swing.JFrame;

public class HappyFace
{
	public static void main(String[] args)
	{
		JFrame aWindow = new JFrame();
		aWindow.setBackground(Color.BLACK);
		aWindow.setSize(300, 300);
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aWindow.setTitle("Happy Face");
		
		HappyFaceA panel = new HappyFaceA();
		aWindow.add(panel);
		
		aWindow.setVisible(true);
	}
}