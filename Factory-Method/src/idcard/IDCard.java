package idcard;

import framework.Product;

public class IDCard extends Product{
	
    private String owner;

    // 같은 패키지에 속한 클래스들만 생성자 호출 가능
    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }
    
	@Override
	public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
	}
	
    public String getOwner() {
        return owner;
    }
    
}
