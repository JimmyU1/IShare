package com.ljn.dao.impl;

import com.ljn.dao.ReviewDao;
import com.ljn.model.Review;
import org.springframework.stereotype.Repository;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Repository("reviewDao")
public class ReviewDaoImpl extends BaseDaoImpl<Review> implements ReviewDao {
}
