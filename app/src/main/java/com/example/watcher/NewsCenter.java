package com.example.watcher;


/**
 * 新闻app今日头条作为内容发布者 NewsCenter
 * 用户作为手机端消息的订阅者 Watcher
 * 此处比喻比较形象，而且单词不会像Observe和Observable那样陌生和容易混淆
 */


public interface NewsCenter {
    //注册新闻订阅通知
    void registerWatcher(Watcher watcher);

    //移除新闻订阅通知
    void removeWatcher(Watcher watcher);

    //当有新的新闻的时候通知推送给用户
    void notifyWatchers();
}
