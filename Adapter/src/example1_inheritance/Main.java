package example1_inheritance;

public class Main {

	public static void main(String[] args) {

		Print p = new PrintBanner("Hello");
		
		// ���� ���� �����ϴ� Banner Ŭ������ �޼ҵ�� Main Ŭ�������� ������ ����Ǿ� ����
		p.printWeak();
		p.printStrong();

	}

}
