package com.lieson.repository;

import com.lieson.model.Cart;
import com.lieson.model.CartItem;
import com.lieson.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);
}
