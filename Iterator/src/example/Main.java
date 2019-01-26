package example;

public class Main {

	public static void main(String[] args) {
		
		/* 책꽂이(BookShelf)에 책(Book)을 넣은 후,
		 * 순서대로 하나씩 다시 끄집어 내어 책 이름을 표시하는 프로그램*/
		
    	// 책꽂이 생성 후 책을 꽂음
        BookShelf bookShelf = new BookShelf(4);
        
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));
        
        /* Iterator 사용할 경우 */
        
		// 책꽂이의 Iterator를 얻어옴
        // 실제 생성되는 객체의 타입은 BookShelfIterater
		Iterator it = bookShelf.iterator();
		
		// 책이 더 있는지 검사하기 위해서, iterator의 hasNext()를 호출
		// 책꽂이에 책이 하나도 없을 때까지 반복
		while (it.hasNext()) {
			Book book = (Book)it.next(); // 다음 책을 얻어옴
			
			// 위 문장 대신에
			// Object book = it.next();
			// 을 사용하면 안 된다.
            // 왜냐하면, 아래에서 book.getName()을 호출하는데,
			// Object 타입은 getName() 을 지원하지 않는다.
			// 따라서,  it.next( )가 반환한 Object 형을 Book 형으로 "강제형변환"해야 한다.

			// 책의 이름을 출력
			System.out.println("" + book.getName());
           
        }
		
		/* Iterator를 사용하지 않는 경우 */
        // 책꽂이에 직접 접근해서 for문을 돌며 각 책을 얻어와서 책의 이름을 출력
		for(int i=0; i<bookShelf.getLength(); i++) {
			Book book = bookShelf.getBookAt(i);
            System.out.println("" + book.getName());
	    }
		

	}

}
