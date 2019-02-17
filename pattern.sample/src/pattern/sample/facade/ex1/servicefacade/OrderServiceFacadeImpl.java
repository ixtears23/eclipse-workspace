package pattern.sample.facade.ex1.servicefacade;

import pattern.sample.facade.ex1.domain.Product;
import pattern.sample.facade.ex1.subcomponents.InventoryService;
import pattern.sample.facade.ex1.subcomponents.PaymentService;
import pattern.sample.facade.ex1.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	@Override
	public boolean placeOrder(int pid) {
		boolean orderFulfilled = false;
		Product product = new Product();
		product.productId = pid;
		if(InventoryService.isAvailable(product)) {
			System.out.println("Product wuth ID: " + product.productId + " is available.");
			boolean paymentConfirmed = PaymentService.makePayment();
			if(paymentConfirmed) {
				System.out.println("Payment confirmed...");
				ShippingService.shipProduct(product);
				System.out.println("Payment shipped...");
				orderFulfilled = true;
			}
		}
		
		return orderFulfilled;
	}

}
