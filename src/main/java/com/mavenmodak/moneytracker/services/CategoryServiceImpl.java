package com.mavenmodak.moneytracker.services;

import com.mavenmodak.moneytracker.exceptions.MtBadRequestException;
import com.mavenmodak.moneytracker.exceptions.MtResourceNotFoundException;
import com.mavenmodak.moneytracker.model.Category;
import com.mavenmodak.moneytracker.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{


    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public List<Category> fetchAllCategories(Integer userId) {

        return categoryRepository.findAll(userId);

    }

    @Override
    public Category fetchCategoryById(Integer userId, Integer categoryId) throws MtResourceNotFoundException {
        return categoryRepository.findById(userId,categoryId);
    }

    @Override
    public Category addCategory(Integer userId, String title, String description) throws MtBadRequestException {

        int categoryId = categoryRepository.create(userId, title, description);
        return categoryRepository.findById(userId, categoryId);
    }

    @Override
    public void updateCategory(Integer userId, Integer categoryId, Category category) throws MtBadRequestException {

        categoryRepository.update(userId,categoryId,category);

    }

    @Override
    public void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws MtResourceNotFoundException {

        this.fetchCategoryById(userId, categoryId);
        categoryRepository.removeById(userId, categoryId);
    }
}
