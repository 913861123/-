package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找图书：");
        System.out.println("请输入要查找的图书的名字");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找到此书");
    }
}
