package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("删除图书：");
        System.out.println("请输入要删除的图书的名字：");
        String name = scanner.nextLine();

        int index = -1;
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            //找到了就标记下标
            if (book.getName().equals(name)) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("书架上没有这本书");
            return;
        }
        //从后往前移
        for (int i = index; i < currentSize; i++) {
            Book book = bookList.getBooks(i+1);
            bookList.setBooks(i,book);
        }

        //防止内存泄露
        bookList.setBooks(currentSize-1,null);
        bookList.setUsedSize(currentSize-1);
        System.out.println("删除成功");
    }
}
