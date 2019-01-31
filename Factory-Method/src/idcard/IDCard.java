package idcard;

import framework.Product;

public class IDCard extends Product{
	
    private String owner;

    // ���� ��Ű���� ���� Ŭ�����鸸 ������ ȣ�� ����
    IDCard(String owner) {
        System.out.println(owner + "�� ī�带 ����ϴ�.");
        this.owner = owner;
    }
    
	@Override
	public void use() {
        System.out.println(owner + "�� ī�带 ����մϴ�.");
	}
	
    public String getOwner() {
        return owner;
    }
    
}
