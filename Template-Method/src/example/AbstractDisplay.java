package example;

// Template 역할를 하는 메소드가 정의되는 상위 클래스
public abstract class AbstractDisplay {
	
	public abstract void open();
	public abstract void print();
	public abstract void close();

	// Template Method
	// 추상 메소드들을 호출되어 처리의 흐름을 결정
	// 실제로 하는 일은 하위 클래스에서 결정하기 때문에 하위 클래스를 봐야 함
	public final void display() {
		open();
		
		for (int i = 0; i < 5; i++) {
			print();
		}
		
		close();	
	}
}
