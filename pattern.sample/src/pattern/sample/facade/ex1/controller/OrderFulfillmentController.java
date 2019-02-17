package pattern.sample.facade.ex1.controller;

import pattern.sample.facade.ex1.servicefacade.OrderServiceFacade;

public class OrderFulfillmentController {
	OrderServiceFacade facade;
	boolean orderFulfilled = false;
	public void orderProduct(int productId) {
		orderFulfilled = facade.placeOrder(productId);
		System.out.println("OrderFulfillmentController: Order fulfillment completed.");
	}
}
