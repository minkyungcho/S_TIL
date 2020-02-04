package hwjava06_서울_9_조민경;

import hwjava06_서울_9_조민경.ProductMgr;

public class ProductTest {

	public static void main(String[] args) {
		
		ProductMgr pmgr = new ProductMgr();
		
		pmgr.dataSet();
		pmgr.searchAll();
		pmgr.searchId(123);
		pmgr.searchName("삼성");
		pmgr.searchTV();
		pmgr.searchRefrigerator();
		pmgr.delete(127);
		pmgr.sumRemainder();
		
	}

}
