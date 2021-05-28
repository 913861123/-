package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("借阅图书 ！");
        System.out.println("请输入要借阅书的书名");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name) && !(book.getBorrowed()) ) {
                book.setBorrowed(true);
                System.out.println("成功借出");
                return;
            }
        }
        System.out.println("借阅失败，书架没有这本书");
    }
}
