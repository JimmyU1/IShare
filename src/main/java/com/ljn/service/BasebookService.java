package com.ljn.service;


import com.ljn.model.Basebook;

import java.io.IOException;

/**
 * Created by ljn19 on 2017-03-31.
 */
public interface BasebookService{
    public void saveBasebook(String isbn13) throws IOException;

    public Basebook getBasebookByURL(String isbn13) throws IOException;
}
