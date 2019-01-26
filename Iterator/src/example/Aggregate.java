package example;

// 집합체를 나타내는 인터페이스
public interface Aggregate {
    public abstract Iterator iterator(); // 집합체의 Iterator 한 개를 생성해 반환하는 메소드
}
