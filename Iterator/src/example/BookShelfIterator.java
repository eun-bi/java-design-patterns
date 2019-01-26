package example;

// å����(BookShelf)�� �ִ� å���� �ϳ��� ������� Ŭ���� (Iterator ����)
public class BookShelfIterator implements Iterator  {

	private BookShelf bookShelf; // �˻��� å����
	
	private int index; // ���� å
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	
	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) { // ���� å�� �ִٸ� true
			return true;
		} else {
			return false;
		}
	}

	// ���� ����Ű�� �ִ� å�� ��ȯ�ϰ� ���� å�� ����Ű�� �޼ҵ�
	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
