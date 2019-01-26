package example;

// 책꽂이에 꽂힐 책을 나타내는 클래스
public class Book {

    private String name = ""; // 책 이름
    
    public Book(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
