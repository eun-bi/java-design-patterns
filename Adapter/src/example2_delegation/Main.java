package example2_delegation;

public class Main {

	public static void main(String[] args) {
		
		/* ex2) 위임을 이용한 Adapter 패턴
		 * Banner 클래스라는 기존의 클래스를 이용해서,
		 * Print 인터페이스를 구현하는 PrintBanner 클래스(Adapter 역할)를
		 * 이용해 일을 처리하는 프로그램
		 */
		
		Print p = new PrintBanner("Hello");
		
		// 실제 일을 수행하는 Banner 클래스의 메소드는 Main 클래스에서 완전히 은폐되어 있음
		p.printWeak();
		p.printStrong();

	}

}
