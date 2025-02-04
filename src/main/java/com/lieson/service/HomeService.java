package com.lieson.service;

import com.lieson.model.Home;
import com.lieson.model.HomeCategory;

import java.util.List;

public interface HomeService {
    public Home createHomePageData(List<HomeCategory> allCategories);
}
