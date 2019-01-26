package example;

// 집합체의 원소를 하나하나 끄집어내는 인터페이스 
public interface Iterator {
    public abstract boolean hasNext(); // 다음 원소가 존재하는지 조사할 때사용되는 메소드 (더 없다면 false 반환)
    public abstract Object next();     // 그 다음 원소를 얻어돌 때 사용되는 메소드 
}
