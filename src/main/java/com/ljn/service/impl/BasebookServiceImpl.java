package com.ljn.service.impl;

import com.ljn.common.RetrieveDocumentByURL;
import com.ljn.model.Basebook;
import com.ljn.service.BasebookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Transactional
@Service("basebookService")
public class BasebookServiceImpl extends BaseServiceImpl implements BasebookService{
    @Override
    public void saveBasebook(String isbn13) throws IOException {
        Basebook basebook = RetrieveDocumentByURL.retrieveDocument(isbn13);
        basebook.setGmtCreate(new Timestamp(new Date().getTime()));
        System.out.println(basebook.toString());
        basebookDao.save(basebook);
    }

    @Override
    public Basebook getBasebookByURL(String isbn13) throws IOException {
        Basebook basebook = RetrieveDocumentByURL.retrieveDocument(isbn13);
        return basebook;
    }


}
