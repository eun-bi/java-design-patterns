package example2_delegation;

//'이미 제공되어 있는 것' 으로 수정 x
public class Banner {
	
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	// 문자열 앞 뒤에 괋호를 붙여서 출력하는 메소드
	public void showWithParen() {
		System.out.println("[" + string + "]");
	}

	// 문자열 앞 뒤에 '*'를 붙여서 출력하는 메소드
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
	
}
