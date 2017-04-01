package com.ljn.dao.impl;

import com.ljn.dao.ContactDao;
import com.ljn.model.Contact;
import org.springframework.stereotype.Repository;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Repository("contactDao")
public class ContactDaoImpl extends BaseDaoImpl<Contact> implements ContactDao {
}
