package com.platterly.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.platterly.Exception.CartException;
import com.platterly.Exception.OrderException;
import com.platterly.Exception.RestaurantException;
import com.platterly.Exception.UserException;
import com.platterly.model.Order;
import com.platterly.model.PaymentResponse;
import com.platterly.model.User;
import com.platterly.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
