package example;

// ����ü�� ���Ҹ� �ϳ��ϳ� ������� �������̽� 
public interface Iterator {
    public abstract boolean hasNext(); // ���� ���Ұ� �����ϴ��� ������ �����Ǵ� �޼ҵ� (�� ���ٸ� false ��ȯ)
    public abstract Object next();     // �� ���� ���Ҹ� �� �� ���Ǵ� �޼ҵ� 
}
