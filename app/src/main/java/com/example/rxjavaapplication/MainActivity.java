package com.example.rxjavaapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.iterator.Book;
import com.example.iterator.BookShelf;
import com.example.iterator.Iterator;
import com.example.watcher.NewsData;
import com.example.watcher.NewsDisplay;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        textWatcher();
//        iterator();
    }

    private void textWatcher() {
        //新建一条消息
        NewsData newsData = new NewsData();
        //设置用户手机端预计要显示的内容
        NewsDisplay newsDisplay1 = new NewsDisplay(newsData);
        NewsDisplay newsDisplay2 = new NewsDisplay(newsData);

        String title = "特朗普拒绝承诺“和平交权”，美军方表态";
        String text = "据央视新闻客户端报道，美国总统特朗普日前面对媒体记者提问时，拒绝明确承诺“在总统选举中无论输赢，都会和平移交权力”，称“要视情况而定”。\n" +
                "\n" +
                "　　特朗普此番言论再次掀起舆论风波，一些人猜测，特朗普可能会寻求动用总统权力，包括其作为美国三军统帅的角色来延长自己的任期。对此，多名美国军方高层日前明确表示，不会介入总统选举。";
        String author = "长安街知事";
        List<String> comments = new ArrayList<>();
        comments.add("一个特朗普热闹了全世界，把一个美国弄到千疮百孔也不易。");
        comments.add("对这件事儿，我真是有些不理解川总了。对川总来说，承诺了又怎么样？反正自己说瞎话也惯了，何必搞得那么猥猥琐琐？");
        comments.add("像他这种奇葩，巨婴，谎话连篇，自私，贪心，甩锅手，把二十多万人命当儿戏，超级政客，政治病毒");
        comments.add("我倒是很希望特朗普落败而不移交总统权力，那样美国就会发生内战，越乱越好，台湾即可轻松收回！");
        comments.add("特朗普，竟然如此无耻。无能，就是“无能”，你家侄女都这样说。何必在“无能”之后，硬要给自己加上个“无耻”呢？");
        comments.add("选民邮寄投票就会滋生“选举欺诈”，老特如果输了不承认选举结果是正确决定。老特，我们支持您！加油！");
        comments.add("当我们认为一个人坏的时候，媒体会无限放大他的缺点，甚至利用一切的信息来丑化他！但他究竟有多坏！并不是媒体和主观的臆想能够决定的！");
        newsData.sendNews(title, text, author, comments);

    }

    private void iterator() {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            Log.e(TAG, "initView: "+book.getName());
        }
    }




    private void initView() {

    }
}