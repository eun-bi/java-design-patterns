package example1_inheritance;

// adapter 역할을 하는 클래스
// 필요한 메소드는 Print에 정의된 printWeak()와 printStrong()인데
// 같은 일을 하는 메소드를 Banner 클래스에서 제공할 경우
// Banner 클래스의 메소드를 재활용하는 Adapter 클래스
public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen(); // Banner로부터 상속받은 메소드 호출
	}

	@Override
	public void printStrong() {
		showWithAster(); // Banner로부터 상속받은 메소드 호출
	}

}
