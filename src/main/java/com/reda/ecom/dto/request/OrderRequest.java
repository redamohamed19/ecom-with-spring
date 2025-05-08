package com.reda.ecom.dto.request;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record OrderRequest(@NotEmpty String status, @NotNull Integer customerId, @Valid List<OrderItem> orderItems) {

	public record OrderItem(@Min(value = 1) Integer quantity, @NotNull Integer menuItemId) {
	}
}
