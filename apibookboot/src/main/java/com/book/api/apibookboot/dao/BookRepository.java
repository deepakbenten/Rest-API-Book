package com.book.api.apibookboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.book.api.apibookboot.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
    public Book findById(int id);

}
