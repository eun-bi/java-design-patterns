package example2_delegation;

public class Main {

	public static void main(String[] args) {
		
		/* ex2) ������ �̿��� Adapter ����
		 * Banner Ŭ������� ������ Ŭ������ �̿��ؼ�,
		 * Print �������̽��� �����ϴ� PrintBanner Ŭ����(Adapter ����)��
		 * �̿��� ���� ó���ϴ� ���α׷�
		 */
		
		Print p = new PrintBanner("Hello");
		
		// ���� ���� �����ϴ� Banner Ŭ������ �޼ҵ�� Main Ŭ�������� ������ ����Ǿ� ����
		p.printWeak();
		p.printStrong();

	}

}
