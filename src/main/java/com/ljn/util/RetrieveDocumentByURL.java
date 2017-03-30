package com.ljn.util;

import com.ljn.model.Basebook;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ljn19 on 2017-03-30.
 */
public class RetrieveDocumentByURL {

    /**
     * 从豆瓣网通过ISBN13获取图书信息
     * @param isbn13 13位ISBN编码
     * @return BaseBook对象
     * @throws ClientProtocolException 协议解析异常
     * @throws IOException IO异常
     */
    public static Basebook retrieveDocument(String isbn13)  throws ClientProtocolException,IOException {
        String url = "http://api.douban.com/book/subject/isbn/" + isbn13;
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();
        InputStream is = entity.getContent();
        Basebook book = new BookXMLParser(is).getBook();
        return book;
    }

}
