package com.coder2client.cart.repository;

import com.coder2client.cart.enity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
