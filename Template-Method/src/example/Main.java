package example;

public class Main {

	public static void main(String[] args) {
		
		/* Template Method �� ����Ǿ� �ִ� �߻� Ŭ������
		 * ��ӹ��� ���� Ŭ�������� ������ ���� ó���ϴ� Template Method ��������
		 * ���ڿ� �����¿츦 ����ؼ� ����ϴ� ���α׷�
		 * */
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello world");
		
		// ���� ������ ������ Ŭ�������� ����
		d1.display();
		d2.display();
	}

}
