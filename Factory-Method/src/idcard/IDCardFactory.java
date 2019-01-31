package idcard;

import java.util.Vector;

import framework.Factory;
import framework.Product;

// IDCard 객체가 필요하면 이 클래스를 통해 IDCard를 생산
public class IDCardFactory extends Factory{
	
	// 전체 크기가 정해져있지 않고 원소를 추가하면 크기가 늘어나는 Vector
	private Vector owners = new Vector();
    
	// IDCard 생산
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	// 생산 제품의 owner를 등록
	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public Vector getOwners() {
		return owners;
	}

}
