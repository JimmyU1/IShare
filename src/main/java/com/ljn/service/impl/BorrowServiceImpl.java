package com.ljn.service.impl;

import com.ljn.service.BorrowService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Transactional
@Service("borrowService")
public class BorrowServiceImpl extends BaseServiceImpl implements BorrowService {
}
