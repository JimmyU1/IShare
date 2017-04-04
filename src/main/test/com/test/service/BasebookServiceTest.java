package com.test.service;

import com.ljn.model.Basebook;
import com.test.common.BaseServiceTest;
import org.junit.Test;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.io.IOException;

/**
 * Created by ljn19 on 2017-04-03.
 */
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class BasebookServiceTest extends BaseServiceTest {

    @Test
    public void saveBasebook() {
        String isbn13 = "9787308083256";
        try {
            basebookService.saveBasebook(isbn13);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getBasebookByUrl(){
        String isbn13 = "9787308083256";
        try {
            Basebook basebook = basebookService.getBasebookByURL(isbn13);
            System.out.println(basebook.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
