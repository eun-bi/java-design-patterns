package example;

// 책꽂이(BookShelf)에 있는 책들을 하나씩 끄집어내는 클래스 (Iterator 구현)
public class BookShelfIterator implements Iterator  {

	private BookShelf bookShelf; // 검색할 책꽂이
	
	private int index; // 현재 책
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	
	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) { // 다음 책이 있다면 true
			return true;
		} else {
			return false;
		}
	}

	// 현재 가리키고 있는 책을 반환하고 다음 책을 가리키는 메소드
	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
