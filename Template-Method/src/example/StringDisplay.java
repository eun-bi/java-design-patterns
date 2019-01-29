package example;

//상위 클래스를 상속받는 하위클래스로,
//상위 클래스의 추상 메소드를 구현해 실제로 일을 처리하는 클래스
public class StringDisplay extends AbstractDisplay{
	
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length; // 문자열의 바이트 수(한글 표시를 위함)
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		
		System.out.print("+");
		
		// 문자열의 개수만큼 -표시
		for (int i = 0; i < width; i++) { 
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
}
