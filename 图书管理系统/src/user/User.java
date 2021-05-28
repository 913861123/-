package user;

import book.BookList;
import com.sun.corba.se.spi.ior.Identifiable;
import operation.IOperation;

public abstract class User {
    protected String name;
    IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        iOperations[choice].work(bookList);
    }

}
