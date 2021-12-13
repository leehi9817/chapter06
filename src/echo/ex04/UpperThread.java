package echo.ex04;

public class UpperThread extends Thread {

	@Override
	public void run() {
		for(char c='A'; c<='Z'; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
