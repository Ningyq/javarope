package com;

public class Test {
    public static void main(String[] args){
        Book book = new Book("《Java入门》","明日科技",78.9);
        System.out.println("书名："+book.getTitle());
        System.out.println("作者："+book.getAuthor());
        System.out.println("价格："+book.getPrice());
    }
}
