package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("归还图书 ！");
        System.out.println("请输入要归还的书名");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name) && book.getBorrowed()) {
                book.setBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("归还失败，系统中没有这本书或者此书未被借出！");
    }
}
