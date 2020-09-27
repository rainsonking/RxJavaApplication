package com.example.watcher;


import java.util.ArrayList;
import java.util.List;

/**
 * 新闻数据类
 *
 * 这些数据必须要实现今日头条的消息注册系统中才能正常的推送给用户
 * 所以要实现今日头条系统的三个接口模板方法：注册、移除、通知用户
 * 如此才算是一个可用的数据
 *
 * 假设新闻有几样数据需要呈现给用户读者 标题、正文、作者、评价
 *
 */
public class NewsData implements NewsCenter{

    private List<Watcher> watchers;
    private String title;//标题
    private String text;//正文
    private String author;//作者
    private List<String> comments;//评论
    public NewsData() {
        this.watchers = new ArrayList<>();
    }

    //实现这些方法，以适配头条的新闻推送系统

    //添加订阅这些新闻推送的用户
    @Override
    public void registerWatcher(Watcher watcher) {
        watchers.add(watcher);
    }
    //移除拒绝通知栏弹窗的用户，用户在系统中取消通知
    @Override
    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    //需要推送时，推送给用户，用户就可以阅读了，具体时间怎么阅读，用户自己来实现
    @Override
    public void notifyWatchers() {
        for (Watcher watcher : watchers){
            watcher.readNews();
        }
    }

    public void newsSend() {
        notifyWatchers();
    }

    public void sendNews(String title, String text,
                        String author, List<String> comments) {
        this.title = title;
        this.text = text;
        this.author = author;
        this.comments = comments;
        newsSend();
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getComments() {
        return comments;
    }
}
