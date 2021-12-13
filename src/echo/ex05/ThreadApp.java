package echo.ex05;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		Runnable digit = new DigitRunableImpl();
		Thread thread1 = new Thread(digit);
		*/
		
		Thread thread1 = new Thread(new DigitRunableImpl());
		
		thread1.start();
		
		for(char c='A'; c<='Z'; c++) {
			System.out.println(c);
			Thread.sleep(1000);
		}
	}

}
