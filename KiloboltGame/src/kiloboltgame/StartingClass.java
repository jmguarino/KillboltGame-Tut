package kiloboltgame;

import java.applet.Applet;

public class StartingClass extends Applet implements Runnable {
	@Override
	public void init() {
	}

	@Override
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void run() {
		while(true){
			repaint();
			try{
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
