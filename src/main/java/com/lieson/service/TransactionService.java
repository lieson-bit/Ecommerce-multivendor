package com.lieson.service;

import com.lieson.model.Order;
import com.lieson.model.Seller;
import com.lieson.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction createTransaction(Order order);
    List<Transaction> getTransactionsBySellerId(Seller seller);
    List<Transaction> getAllTransactions();
}

