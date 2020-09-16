package com.mavenmodak.moneytracker.services;


import com.mavenmodak.moneytracker.exceptions.MtBadRequestException;
import com.mavenmodak.moneytracker.exceptions.MtResourceNotFoundException;
import com.mavenmodak.moneytracker.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws MtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws MtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws MtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws MtResourceNotFoundException;
}
