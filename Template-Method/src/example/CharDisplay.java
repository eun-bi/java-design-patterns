package example;

// 상위 클래스를 상속받는 하위클래스로,
// 상위 클래스의 추상 메소드를 구현해 실제로 일을 처리하는 클래스
public class CharDisplay extends AbstractDisplay {

	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}

}
