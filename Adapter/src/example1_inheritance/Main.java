package example1_inheritance;

public class Main {

	public static void main(String[] args) {

		Print p = new PrintBanner("Hello");
		
		// 실제 일을 수행하는 Banner 클래스의 메소드는 Main 클래스에서 완전히 은폐되어 있음
		p.printWeak();
		p.printStrong();

	}

}
