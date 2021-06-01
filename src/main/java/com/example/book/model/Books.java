package com.example.book.model;

import lombok.Data;
import lombok.Value;

import javax.persistence.*;

@Data
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "Book_Name")
    String book_Name;
}
