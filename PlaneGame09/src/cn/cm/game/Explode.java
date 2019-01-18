package cn.cm.game;

import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.IIOImage;

public class Explode {
	double x,y;//±¬Õ¨Î»ÖÃ
	
	static Image[] imgs =new Image[16];  //16¸öÍ¼Æ¬  
	
	static {
		for(int i=0;i<16;i++) {
			imgs[i] = GameUtil.getImage("explode/e"+(i+1)+".gif") ;
			imgs[i].getWidth(null);
		}
	}
	
	int count;

	public void draw(Graphics g) {
		if (count <= 15) {
			g.drawImage(imgs[count], (int) x, (int) y, null);
			count++;
		}
	}

	public Explode(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
