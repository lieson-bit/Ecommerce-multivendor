package com.lieson.repository;

import com.lieson.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<Wishlist, Long> {
    Wishlist findByUserId(Long userId);
}
