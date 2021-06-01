package com.example.book.controller;

import com.example.book.model.Books;
import com.example.book.service.BookServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Books")
@CrossOrigin(value = "*")
public class BookController {

    private BookServices bookServices;

    @PostMapping ()
    public ResponseEntity save(@RequestBody Books books){
        bookServices.save(books);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity update(@RequestBody Books books){
        bookServices.update(books);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable int id ){
        bookServices.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Books>> findAllBooks(){
        List<Books> Books = bookServices.getAllBooks();
        return new ResponseEntity<>(Books, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Books> findBookById(@PathVariable int id){
        Books books = bookServices.getBooksById(id);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
