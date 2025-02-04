package com.lieson.repository;

import com.lieson.model.Order;
import com.lieson.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
