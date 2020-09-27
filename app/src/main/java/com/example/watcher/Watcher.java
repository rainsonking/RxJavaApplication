package com.example.watcher;


/**
 * 看新闻的用户，该用户可以在通知栏中查看新闻
 */
public interface Watcher {

    //查看新闻,消费这条通知
    void readNews();
}
