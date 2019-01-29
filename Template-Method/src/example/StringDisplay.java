package example;

//���� Ŭ������ ��ӹ޴� ����Ŭ������,
//���� Ŭ������ �߻� �޼ҵ带 ������ ������ ���� ó���ϴ� Ŭ����
public class StringDisplay extends AbstractDisplay{
	
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length; // ���ڿ��� ����Ʈ ��(�ѱ� ǥ�ø� ����)
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		
		System.out.print("+");
		
		// ���ڿ��� ������ŭ -ǥ��
		for (int i = 0; i < width; i++) { 
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
}
