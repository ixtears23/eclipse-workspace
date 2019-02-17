package pattern.sample.facade.ex1.controller;

import pattern.sample.facade.ex1.servicefacade.OrderServiceFacadeImpl;

public class OrderFulfillmentControllerTest {
	
	public static void main(String[] args) {
		OrderFulfillmentController controller = new OrderFulfillmentController();
		controller.facade = new OrderServiceFacadeImpl();
		controller.orderProduct(9);
		boolean result = controller.orderFulfilled;
		System.out.println(result);
	}

}
