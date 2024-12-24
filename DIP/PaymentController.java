public class PaymentController {

	private IPayable paymentMethod;

	public void setPaymentMethod(IPayable paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void pay() {
		paymentMethod.pay();
	}
}
