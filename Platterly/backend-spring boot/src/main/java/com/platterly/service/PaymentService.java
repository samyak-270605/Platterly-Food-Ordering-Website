package com.platterly.service;

import com.stripe.exception.StripeException;
import com.platterly.model.Order;
import com.platterly.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
