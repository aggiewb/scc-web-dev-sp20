
import java.awt.*;
public class MickeyBox {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics graphic = panel.getGraphics();
		
		graphic.setColor(Color.BLUE);
		graphic.fillOval(50, 25, 40, 40);
		graphic.fillOval(130, 25, 40, 40);
		
		graphic.setColor(Color.RED);
		graphic.fillRect(70, 45, 80, 80);
		
		graphic.setColor(Color.BLACK);
		graphic.drawLine(70, 85, 150, 85);
		
	}
	
}
