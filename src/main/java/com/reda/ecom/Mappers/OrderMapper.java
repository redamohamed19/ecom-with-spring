package com.reda.ecom.Mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.reda.ecom.dto.request.OrderRequest;
import com.reda.ecom.models.Customer;
import com.reda.ecom.models.MenuItem;
import com.reda.ecom.models.Order;
import com.reda.ecom.models.OrderItem;

@Service
public class OrderMapper {

	public Order toOrder(OrderRequest orderRequest) {
		Order order = new Order();

		// Set basic order info
		order.setStatus(orderRequest.status());

		Customer customer = new Customer();
		customer.setId(orderRequest.customerId());
		order.setCustomer(customer);

		// Map order items
		List<OrderItem> orderItems = orderRequest.orderItems().stream().map(orderItemDto -> {
			OrderItem orderItem = new OrderItem();
			orderItem.setQuantity(orderItemDto.quantity());

			MenuItem menuItem = new MenuItem();
			menuItem.setId(orderItemDto.menuItemId());
			orderItem.setMenuItem(menuItem);

			orderItem.setOrder(order); // important to set back-reference
			return orderItem;
		}).collect(Collectors.toList());

		order.setOrderItems(orderItems);

		return order;
	}
}
