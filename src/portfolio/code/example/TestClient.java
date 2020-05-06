package portfolio.code.example;

import java.math.BigInteger;

public class TestClient {

	public static void main(String[] args) {

		long start = System.currentTimeMillis(); //시작하는 시점 계산
		
		@SuppressWarnings("unused")
		BigInteger b = new BigInteger("2");
		long count = new Long("10000000000");
		
		
		
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("메모리 : " + used/1000.0 + " KB");
		System.out.println("실행 시간 : " + ( end - start )/1000.0 + "초");
		
	}
}
