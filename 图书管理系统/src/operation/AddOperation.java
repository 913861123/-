package operation;

import book.Book;
import book.BookList;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增图书 !");
        System.out.println("请输入要新增的书名");
        String name = scanner.nextLine();
        //判断书架上是否有该书
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                System.out.println("书架上已存在这本书！");
                return;
            }
        }

        System.out.println("请输入书的作者名字");
        String author = scanner.nextLine();
        System.out.println("请输入书的类型");
        String type = scanner.nextLine();
        System.out.println("请输入书的价格");
        int price = scanner.nextInt();

        Book books = new Book(name,author,price,type);
        bookList.setBooks(currentSize,books);
        bookList.setUsedSize(currentSize+1);
        System.out.println("添加成功成功");
    }
}
