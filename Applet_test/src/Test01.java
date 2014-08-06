import java.applet.Applet;
import java.awt.Graphics;


public class Test01 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override//消すなー
	public void init() {//プログラム実行前の初期処理
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void paint(Graphics g) {//gでなくてもよい
		// TODO Auto-generated method stub
		g.drawString("文字を表示", 10, 10);
	
	}

	
	
}
