package com.example.travelblog.http;

import java.util.List;

public class BlogArticlesCallback {
    void onSuccess(List<Blog> blogList);
    void onError();
}
