package echo.ex03;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new DigitThread();
		//start() 안에 run()이 내장되어 있어 출장을 보내려면 start()를 써야함
		//run()메소드는 오버라이드 처리 하였음
		thread.start();	//출장보내기
		
		for(char c='A'; c<='Z'; c++) {
			System.out.println(c);
			Thread.sleep(1000);
		}
	}

}
