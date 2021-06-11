package controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.BookModel;

import services.ConnectionProvider;

public class BookController {

    static Connection con = ConnectionProvider.getCon();
    private static ArrayList<BookModel> books;

    public BookController() {
    }

    private static void retrieveAfter() {
        books = getBooks();
    }

    //retrieve all books
    //temporary
    public static ArrayList<BookModel> getBooks() {
        books = new ArrayList<>();
        try {
            String query = "SELECT * FROM `book`";
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                BookModel book = new BookModel();
                book.setBookID(result.getInt("bookID"));
                book.setIsbn(result.getString("isbn"));
                book.setBookCategory(result.getString("bookCategory"));
                book.setTitle(result.getString("title"));
                book.setAuthor(result.getString("author"));
                book.setNoOfCopies(result.getInt("noOfCopies"));
                book.setPublisher(result.getString("publisher"));
                book.setPrice(result.getFloat("price"));

                // book.setPublisher(result.getDate("publisher"));
                // book.setStock_number(result.getInt("stockNumber"));
                books.add(book);
            }
            ConnectionProvider.close(result);
            System.out.println("Successfully retrieved!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return books;
    }

    public static void updateBook(String isbn, String bookCategory, String title,
            String author, int noOfCopies, String publisher, double price, int timesBorrowed) {
        try {
            String query = "UPDATE `book` SET"
                    + "`isbn`=?,`bookCategory`=?,`title`=?,"
                    + "`author`=?,`noOfCopies`=?,`publisher`=?,`price`=?,`timesBorrowed`=? WHERE bookID=? ";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, isbn);
            preparedStmt.setString(2, bookCategory);
            preparedStmt.setString(3, title);
            preparedStmt.setString(4, author);
            preparedStmt.setInt(5, noOfCopies);
            preparedStmt.setString(6, publisher);
            preparedStmt.setDouble(7, price);
            preparedStmt.setInt(8, timesBorrowed);

            preparedStmt.execute();

            System.out.println("Successfully Edited!");
            retrieveAfter();
            ConnectionProvider.close(preparedStmt);
        } catch (SQLException ex) {

            System.err.println(ex.getMessage());
        }
    }
    
    

}
