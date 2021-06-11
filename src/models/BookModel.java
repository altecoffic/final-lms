package models;

public class BookModel {

    private int bookID;
    private String isbn;
    private String bookCategory;
    private String title;
    private String author;
    private int noOfCopies;
    private String publisher;
    private float price;
    private int timesBorrowed;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getTimesBorrowed() {
        return timesBorrowed;
    }

    public void setTimesBorrowed(int timesBorrowed) {
        this.timesBorrowed = timesBorrowed;
    }

//    public enum BookStatus {
//        AVAILABLE,
//        RESERVED,
//        LOANED,
//        LOST
//    }

    public enum ReservationStatus {
        WAITING,
        PENDING,
        CANCELED,
        NONE
    }

    public class Constants {

        public static final int MAX_BOOKS_ISSUED_TO_A_USER = 5;
        public static final int MAX_LENDING_DAYS = 7;
    }

}
