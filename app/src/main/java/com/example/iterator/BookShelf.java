package com.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggravate{
    private List<Book> bookList;

    public BookShelf() {
        this.bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public Book getBookAt(int index) {
        return bookList.get(index);
    }

    public void appendBook(Book book) {
        bookList.add(book);
    }

    public int getLength() {
        return bookList.size();
    }

    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }
}
