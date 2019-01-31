package framework;

public abstract class Factory {
	
	// Template Method 패턴 사용
    public final Product create(String owner) {
        Product p = createProduct(owner); // 물건을 만들고
        registerProduct(p); // 등록
        return p;
    }
    
    // Factory Method 역할
    // 하위 클래스에서 구현
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

}
