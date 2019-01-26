package example;

import java.util.Vector;

// å���̸� ��Ÿ���� Ŭ���� (����ü ����)
public class BookShelf implements Aggregate  {

	private Vector books; // å�� �����ϱ� ���� vector
	
	public BookShelf(int initialsize) {
		this.books = new Vector(initialsize);
	}

	// �ش� index�� �ش��ϴ� å�� ��ȯ�ϴ� �޼ҵ�
	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}
	
	// å �� ���� å���̿� �߰��ϴ� �޼ҵ�
	public void appendBook(Book book) {
		books.add(book);
	}

	// ���� å���̿� �ִ� å�� ������ ��ȯ�ϴ� �޼ҵ�
	public int getLength() {
		return books.size();
	}
	
	// å������ å �ϳ��ϳ��� ������� ���� �ϴ� BooksShelfIterator�� �����ϴ� �޼ҵ�
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	
}
