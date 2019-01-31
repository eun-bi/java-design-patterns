package framework;

public abstract class Factory {
	
	// Template Method ���� ���
    public final Product create(String owner) {
        Product p = createProduct(owner); // ������ �����
        registerProduct(p); // ���
        return p;
    }
    
    // Factory Method ����
    // ���� Ŭ�������� ����
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

}
