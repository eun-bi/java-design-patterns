package example1_inheritance;

// adapter ������ �ϴ� Ŭ����
// �ʿ��� �޼ҵ�� Print�� ���ǵ� printWeak()�� printStrong()�ε�
// ���� ���� �ϴ� �޼ҵ带 Banner Ŭ�������� ������ ���
// Banner Ŭ������ �޼ҵ带 ��Ȱ���ϴ� Adapter Ŭ����
public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen(); // Banner�κ��� ��ӹ��� �޼ҵ� ȣ��
	}

	@Override
	public void printStrong() {
		showWithAster(); // Banner�κ��� ��ӹ��� �޼ҵ� ȣ��
	}

}
