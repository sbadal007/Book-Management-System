package com.example.book.service;

import com.example.book.model.Books;
import com.example.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceIMPL implements BookServices{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void save(Books books) {
        bookRepository.save(books);
    }

    @Override
    public void update(Books books) {
        bookRepository.save(books);
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Books getBooksById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public List<Books> getAllBooks() {
        return bookRepository.findAll();
    }

}
