package com.Paycontrol;

public class OrderService {
	private PaymentService paymentservice;
	public OrderService(PaymentService paymetservice) {
		this.paymentservice = paymetservice;
		// TODO Auto-generated constructor stub
	}
	void placeOrder() {
		paymentservice.pay(1000);
	}

}
