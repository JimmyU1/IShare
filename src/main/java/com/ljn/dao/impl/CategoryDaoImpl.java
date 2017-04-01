package com.ljn.dao.impl;

import com.ljn.dao.CategoryDao;
import com.ljn.model.Category;
import org.springframework.stereotype.Repository;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Repository("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao {
}
