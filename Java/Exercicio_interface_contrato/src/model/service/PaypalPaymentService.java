package model.service;

public class PaypalPaymentService implements OnlinePaymentService{

	private static final double PAYMENTE_FEE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	@Override
	public double paymentFee(double amount) {
		return (amount * PAYMENTE_FEE);
	}

	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;
	}
}
