package com.platterly.service;

import java.util.List;

import com.platterly.model.Notification;
import com.platterly.model.Order;
import com.platterly.model.Restaurant;
import com.platterly.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
