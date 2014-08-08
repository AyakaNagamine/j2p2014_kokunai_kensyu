
	import java.applet.Applet;
	import java.awt.*;
	import java.awt.event.*;
	public class Test09 extends Applet implements MouseMotionListener {
		int gx = 0;    //x座標を保持する変数
		int gy = 0;    //Y座標を保持する変数
		Graphics Grp;
		public void init(){
			Grp = getGraphics();
			addMouseMotionListener(this);
		}
		public void mouseDragged(MouseEvent e) {
			//マウスドラッグ時に画面に入力
			Grp.drawLine(gx,gy,e.getX(),e.getY());
			gx = e.getX();
			gy = e.getY();
		}
		public void mouseMoved(MouseEvent e) {
			//現在のマウス座標保持
			gx = e.getX();
			gy = e.getY();
		}
	}

