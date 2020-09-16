package com.mavenmodak.moneytracker.repository;

import com.mavenmodak.moneytracker.exceptions.MtBadRequestException;
import com.mavenmodak.moneytracker.exceptions.MtResourceNotFoundException;
import com.mavenmodak.moneytracker.model.Category;

import java.util.List;

public interface CategoryRepository {


    List<Category> findAll(Integer userId) throws MtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws MtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws MtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws MtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
