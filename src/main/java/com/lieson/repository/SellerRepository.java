package com.lieson.repository;

import com.lieson.domain.AccountStatus;
import com.lieson.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller,Long>{
    Seller findByEmail(String email);
    List<Seller> findByAccountStatus(AccountStatus status);
}
