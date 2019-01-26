package example;

public class Main {

	public static void main(String[] args) {
		
		/* å����(BookShelf)�� å(Book)�� ���� ��,
		 * ������� �ϳ��� �ٽ� ������ ���� å �̸��� ǥ���ϴ� ���α׷�*/
		
    	// å���� ���� �� å�� ����
        BookShelf bookShelf = new BookShelf(4);
        
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));
        
        /* Iterator ����� ��� */
        
		// å������ Iterator�� ����
        // ���� �����Ǵ� ��ü�� Ÿ���� BookShelfIterater
		Iterator it = bookShelf.iterator();
		
		// å�� �� �ִ��� �˻��ϱ� ���ؼ�, iterator�� hasNext()�� ȣ��
		// å���̿� å�� �ϳ��� ���� ������ �ݺ�
		while (it.hasNext()) {
			Book book = (Book)it.next(); // ���� å�� ����
			
			// �� ���� ��ſ�
			// Object book = it.next();
			// �� ����ϸ� �� �ȴ�.
            // �ֳ��ϸ�, �Ʒ����� book.getName()�� ȣ���ϴµ�,
			// Object Ÿ���� getName() �� �������� �ʴ´�.
			// ����,  it.next( )�� ��ȯ�� Object ���� Book ������ "��������ȯ"�ؾ� �Ѵ�.

			// å�� �̸��� ���
			System.out.println("" + book.getName());
           
        }
		
		/* Iterator�� ������� �ʴ� ��� */
        // å���̿� ���� �����ؼ� for���� ���� �� å�� ���ͼ� å�� �̸��� ���
		for(int i=0; i<bookShelf.getLength(); i++) {
			Book book = bookShelf.getBookAt(i);
            System.out.println("" + book.getName());
	    }
		

	}

}
