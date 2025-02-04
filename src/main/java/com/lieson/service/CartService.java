package com.lieson.service;

import com.lieson.model.Cart;
import com.lieson.model.CartItem;
import com.lieson.model.Product;
import com.lieson.model.User;

public interface CartService {
   public CartItem addCartItem(User user, Product product, String size, int quantity);
    public Cart findUserCart(User user);
}
