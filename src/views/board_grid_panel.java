package views;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class board_grid_panel extends JPanel {
private Image image;	

public board_grid_panel(Image i) {
this.image=i;	
}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(image,0,0,null);	
	}

}
