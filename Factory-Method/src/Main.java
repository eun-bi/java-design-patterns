import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {

		/* �ν��Ͻ��� ����� ����� ���� Ŭ�������� ���ϰ� 
		 * �ν��Ͻ��� ������ �����ϴ� ���� ���� Ŭ�������� �����ϴ�
		 * Factory Method ������ ���
		 * IDCardFactory�� ���� IDCard�� �����ϴ� ���α׷� */
		
		// ������ ����
		Factory factory = new IDCardFactory();
        
		// ��ǰ ����
		Product card1 = factory.create("ȫ�浿");
		Product card2 = factory.create("�̼���");
		Product card3 = factory.create("������");
		
		// ��ǰ ���
		card1.use();
		card2.use();
		card3.use();
	}
}
