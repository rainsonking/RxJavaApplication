package com.example.iterator;

/**
 * Concretely iterator(具体的迭代器)
 * 该角色负责实现Iterator角色所定义的接口.该角色包含了遍历集合所必须的信息。
 */
public class BookshelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookshelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
