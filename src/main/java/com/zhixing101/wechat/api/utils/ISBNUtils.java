package com.zhixing101.wechat.api.utils;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.fastjson.JSONObject;
import com.zhixing101.wechat.api.entity.Book;

/**
 * Created by adam on 21/9/16.
 */
public class ISBNUtils {

    private static final Logger logger = LoggerFactory.getLogger(ISBNUtils.class);

    public static final String DBAPI_URL = "https://api.douban.com/v2/book/isbn/";

    /**
     * 根据ISBN获取书籍信息
     * 如果成功则返回book对象
     * 失败则返回空的book对象
     * @param isbn
     */
    public static Book findBookByISBN(String isbn){
        //根据isbn获取豆瓣部分的地址
        String url = DBAPI_URL + isbn;
        Book book = new Book();
        try {
            String result = URLUtils.queryUrl(url);
            logger.debug("获取到了书籍的信息" + result);
            JSONObject jsonObject = JSONObject.parseObject(result);
//            JSONArray jsonArray = jsonObject.getJSONArray("author");
//            String author = "";
//            if (jsonArray != null){
//                for (int i = 0;i < jsonArray.size();i++){
//                    author += jsonArray.toJSONString();
//                }
//            }
            book.setAuthor(jsonObject.getJSONArray("author").toString());
            book.setSummary(jsonObject.getString("summary"));
            book.setTitle(jsonObject.getString("title"));
            book.setPublisher(jsonObject.getString("publisher"));
            book.setBinding(jsonObject.getString("binding"));
            book.setVersion(jsonObject.getString("subtitle"));
            book.setPrice(jsonObject.getString("price"));
            book.setDoubanImageUrl(jsonObject.getJSONObject("images").getString("large"));
            book.setIsbn10(jsonObject.getString("isbn10"));
            book.setIsbn13(jsonObject.getString("isbn13"));
        }catch (Exception e){
            logger.error("获取图书信息出现异常 " + e.getMessage());
            e.printStackTrace();
        }
        return book;
    }

}
