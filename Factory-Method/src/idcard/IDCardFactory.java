package idcard;

import java.util.Vector;

import framework.Factory;
import framework.Product;

// IDCard ��ü�� �ʿ��ϸ� �� Ŭ������ ���� IDCard�� ����
public class IDCardFactory extends Factory{
	
	// ��ü ũ�Ⱑ ���������� �ʰ� ���Ҹ� �߰��ϸ� ũ�Ⱑ �þ�� Vector
	private Vector owners = new Vector();
    
	// IDCard ����
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	// ���� ��ǰ�� owner�� ���
	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public Vector getOwners() {
		return owners;
	}

}
