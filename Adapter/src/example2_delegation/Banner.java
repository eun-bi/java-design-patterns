package example2_delegation;

//'�̹� �����Ǿ� �ִ� ��' ���� ���� x
public class Banner {
	
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	// ���ڿ� �� �ڿ� ��ȣ�� �ٿ��� ����ϴ� �޼ҵ�
	public void showWithParen() {
		System.out.println("[" + string + "]");
	}

	// ���ڿ� �� �ڿ� '*'�� �ٿ��� ����ϴ� �޼ҵ�
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
	
}
