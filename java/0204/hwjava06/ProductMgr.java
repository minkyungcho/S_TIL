package hwjava06_서울_9_조민경;

public class ProductMgr {
	
	static Product[] products = new Product[10];

	public void dataSet() {
		
		TV tv1 = new TV(123, "삼성스마트", 1000, 10, 42, "QLED");
		TV tv2 = new TV(125, "삼성", 500, 20, 36, "LED");
		TV tv3 = new TV(127, "엘지3D", 1500, 5, 47, "QLED");
		
		Refrigerator rf1 = new Refrigerator(234, "딤채", 2000, 4, 100, 100);
		Refrigerator rf2 = new Refrigerator(236, "엘지디오스", 3000, 10, 140, 200);
		Refrigerator rf3 = new Refrigerator(238, "스메그", 4000, 2, 120, 150);
		
		products[0] = tv1;
		products[1] = tv2;
		products[2] = tv3;
		products[3] = rf1;
		products[4] = rf2;
		products[5] = rf3;
		
	}
	
	public void searchAll() {
		for(Product p : products) {
			if(p != null) {
				System.out.println(p.toString());
			}
		}
	}
	
	public void searchId(int id) {
		for(Product p : products) {
			if(p!=null && p.getId() == id) {
				System.out.println(p.toString());
			}
		}
		return;
	}
	
	public void searchName(String str) {
		for(Product p : products) {
			if(p!=null && p.getName().contains(str)) {
				System.out.println(p.toString());
			}
		}
		return;
	}
	
	public void searchTV() {
		for(Product p : products) {
			if(p instanceof TV) {
				System.out.println(p.toString());
			}
		}
	}
	
	public void searchRefrigerator() {
		for(Product p : products) {
			if(p instanceof Refrigerator) {
				System.out.println(p.toString());
			}
		}
	}
	
	public void delete(int id) {
		for(int i=0; i<products.length; i++) {
			if(products[i] !=null && products[i].getId() == id) {
				
				for(int j=i; j<products.length-1; j++) {
					products[j] = products[j+1];					
				}
				System.out.println("상품번호 "+id+" 상품이 삭제되었습니다.");
				break;
			}
		}
	}
	
	public void sumRemainder() {
		int sum = 0;
		for(Product p : products) {
			if(p!=null) {
				sum += p.getPrice()*p.getRemainder();
				
			}
		}
		System.out.println("전체 재고 상품의 총합은 "+sum+"원 입니다.");
	}
	
}
