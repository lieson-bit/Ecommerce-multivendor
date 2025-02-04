package com.lieson.service;

import com.lieson.model.Deal;

import java.util.List;

public interface DealService {
    List<Deal> getDeals(); // no usages
    Deal createDeal(Deal deal); // no usages
    Deal updateDeal(Deal deal, Long id) throws Exception; // no usages
    void deleteDeal(Long id) throws Exception; // no usages
}

