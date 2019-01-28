package example2_delegation;

// adapter 역할을 하는 클래스
// example1 과 다르게 Print를 클래스로 정의하였기 때문에
// Print 클래스와 Banner 클래스를 둘 다 상속받을 수 없음 (자바는 다중상속을 지원x)
// 따라서 위임을 사용
public class PrintBanner extends Print {
	
  private Banner banner; // Banner 클래스의 인스턴스 
  
  public PrintBanner(String string) {
	this.banner = new Banner(string);
  }
  
  public void printWeak() {
	// Banner 객체인 banner의 showWithParen( )을 호출
	// printWeak( )는 자신이 일을 처리하지 않고 banner에게 위임
	banner.showWithParen();
  }

  public void printStrong() {
	// banner의 showWithAster()을 호출
	// PrintBanner 자신이 일을 처리하지 않고, banner에게 위임
	banner.showWithAster();
  }
}
