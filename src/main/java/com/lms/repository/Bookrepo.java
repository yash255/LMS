package com.lms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lms.models.Book;

public interface Bookrepo extends MongoRepository<Book,Integer>{
    

}
