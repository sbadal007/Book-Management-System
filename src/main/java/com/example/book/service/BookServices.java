package com.example.book.service;
import com.example.book.model.Books;

import java.util.List;

public interface BookServices {
    public void save(Books books);
    public void update(Books books);
    public void delete(int id);
    public Books getBooksById(int id);

    public List<Books> getAllBooks();
}
