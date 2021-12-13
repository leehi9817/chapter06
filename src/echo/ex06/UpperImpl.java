package echo.ex06;

public class UpperImpl implements Runnable {

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
