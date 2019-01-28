package example2_delegation;

// adapter ������ �ϴ� Ŭ����
// example1 �� �ٸ��� Print�� Ŭ������ �����Ͽ��� ������
// Print Ŭ������ Banner Ŭ������ �� �� ��ӹ��� �� ���� (�ڹٴ� ���߻���� ����x)
// ���� ������ ���
public class PrintBanner extends Print {
	
  private Banner banner; // Banner Ŭ������ �ν��Ͻ� 
  
  public PrintBanner(String string) {
	this.banner = new Banner(string);
  }
  
  public void printWeak() {
	// Banner ��ü�� banner�� showWithParen( )�� ȣ��
	// printWeak( )�� �ڽ��� ���� ó������ �ʰ� banner���� ����
	banner.showWithParen();
  }

  public void printStrong() {
	// banner�� showWithAster()�� ȣ��
	// PrintBanner �ڽ��� ���� ó������ �ʰ�, banner���� ����
	banner.showWithAster();
  }
}
