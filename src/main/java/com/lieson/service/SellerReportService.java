package com.lieson.service;

import com.lieson.model.Seller;
import com.lieson.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport(SellerReport sellerReport);
}
