package pattern.sample.facade.ex1.subcomponents;

import pattern.sample.facade.ex1.domain.Product;

public class InventoryService {

	public static boolean isAvailable(Product product) {
		/* 제품 가용성에 대한웨어 하우스 데이터베이스 확인 */
		return true;
	}
}
