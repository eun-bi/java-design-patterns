package example;

import java.util.Vector;

// 책꽂이를 나타내는 클래스 (집합체 구현)
public class BookShelf implements Aggregate  {

	private Vector books; // 책을 보관하기 위한 vector
	
	public BookShelf(int initialsize) {
		this.books = new Vector(initialsize);
	}

	// 해당 index에 해당하는 책을 반환하는 메소드
	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}
	
	// 책 한 권을 책꽂이에 추가하는 메소드
	public void appendBook(Book book) {
		books.add(book);
	}

	// 현재 책꽂이에 있는 책의 개수를 반환하는 메소드
	public int getLength() {
		return books.size();
	}
	
	// 책꽂이의 책 하나하나를 끄집어내는 일을 하는 BooksShelfIterator를 생성하는 메소드
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	
}
