package example;

public class Main {

	public static void main(String[] args) {
		
		/* Template Method 가 선언되어 있는 추상 클래스를
		 * 상속받은 하위 클래스에서 실제로 일을 처리하는 Template Method 패턴으로
		 * 문자열 상하좌우를 장식해서 출력하는 프로그램
		 * */
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello world");
		
		// 실제 동작은 각각의 클래스에서 결정
		d1.display();
		d2.display();
	}

}
