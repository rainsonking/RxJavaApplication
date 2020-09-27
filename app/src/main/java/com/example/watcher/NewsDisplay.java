package com.example.watcher;


import android.util.Log;

import java.util.List;

/**
 * 一个类实现了两个接口
 *
 * 构造方法中直接将用户注册到了新闻中
 *
 *
 *
 *
 */
public class NewsDisplay implements Watcher,NotificationBar{


    private static final String TAG = "NewsDisplay";
    private NewsData newsData;

    private String title;//标题
    private String text;//正文
    private String author;//作者
    private List<String> comments;//评论


    public NewsDisplay(NewsData newsData) {
        this.newsData = newsData;
        this.newsData.registerWatcher(this);
    }

    @Override
    public void click2NewsDetail() {
        Log.e(TAG, "用户自己的操作：点击阅读新闻！");
        int count = comments.size();
        Log.e(TAG, "新闻的标题: "+title);
        Log.e(TAG, "新闻的作者: "+author);
        Log.e(TAG, "新闻的正文: "+text);
        for (int i = 0; i < count; i++) {
            Log.e(TAG, "新闻的评论: "+comments.get(i));
        }
    }

    @Override
    public void readNews() {
        Log.e(TAG, "sendNews: 发送到用户手机，通知栏上显示消息");
        this.title = this.newsData.getTitle();//标题
        this.text = this.newsData.getText();//正文
        this.author = this.newsData.getAuthor();//作者
        this.comments = this.newsData.getComments();//评论
        click2NewsDetail();
    }
}
