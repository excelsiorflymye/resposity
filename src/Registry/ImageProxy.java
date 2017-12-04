package Registry;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

public class ImageProxy implements Icon{
	ImageIcon imageIcon;
	URL imageuUrl;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL url){
		imageuUrl = url;
	}

	public int getIconWidth(){
		if(imageIcon != null){
			return imageIcon.getIconWidth();
		}else{
			return 800;
		}
	}
	
	public int getIconHeight(){
		if(imageIcon != null){
			return imageIcon.getIconHeight();
		}else{
			return 600;
		}
	}
	
	public void paintIcon(final Component c, Graphics g, int x, int y){
		if(imageIcon != null){
			imageIcon.paintIcon(c, g, x, y);
		}else{
			g.drawString("Loading CD cover,please wait...", x + 300, y + 190);
			if(!retrieving){
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try{
							imageIcon = new ImageIcon(imageuUrl, "CD cover");
							c.repaint();
						}catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}
}
