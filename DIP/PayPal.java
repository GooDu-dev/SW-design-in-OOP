public class PayPal implements IPayable {
	@Override
	public void pay() {
		System.out.println("Paying with PayPal...");
	}
}
