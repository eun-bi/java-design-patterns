import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {

		/* 인스턴스를 만드는 방법은 상위 클래스에서 정하고 
		 * 인스턴스를 실제로 생성하는 일은 하위 클래스에서 결정하는
		 * Factory Method 패턴을 사용
		 * IDCardFactory를 통해 IDCard를 생산하는 프로그램 */
		
		// 공장을 세움
		Factory factory = new IDCardFactory();
        
		// 제품 생산
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("강감찬");
		
		// 제품 사용
		card1.use();
		card2.use();
		card3.use();
	}
}
