package book;

public class BookList {
    private Book[] books = new Book[20];
    private int usedSize;

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",20,"小说");
        books[1] = new Book("水浒传","施耐庵",20,"小说");
        books[2] = new Book("红楼梦","曹雪芹",20,"小说");
        books[3] = new Book("西游记","吴承恩",20,"小说");

        this.usedSize = 4;
    }

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
        this.usedSize++;
    }

    public Book getBooks(int pos) {
        return this.books[pos];
    }

    public int getUsedSize() {
        return this.usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

}
