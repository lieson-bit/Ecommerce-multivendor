package com.lieson.service;

import com.lieson.model.Product;
import com.lieson.model.User;
import com.lieson.model.Wishlist;

public interface WishListService {

    Wishlist createWishlist(User user);
    Wishlist getWishlistByUserId(User user);
    Wishlist addProductToWishlist(User user, Product product);

}
