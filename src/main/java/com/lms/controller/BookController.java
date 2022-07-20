
package com.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.models.Book;
import com.lms.repository.Bookrepo;



@RestController
@RequestMapping("/api")
class BookController {
    
    @Autowired
    private Bookrepo bookrepo;


    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        bookrepo.save(book);
        return "Added book with id : "+book.getId();
    }

    @GetMapping("/")
    public List<Book> getAllBook(){
        return bookrepo.findAll();
    }

    @GetMapping("getbook/{id}")
    public Optional<Book> getBook(@PathVariable int id){
        return bookrepo.findById(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        bookrepo.deleteById(id);
        return "book deleted with id : "+id;
    }

    @PutMapping("/updateBook/{id}")
    public String updateBook(@RequestBody Book book,@PathVariable int id){
        bookrepo.save(book);
        return "Book updated with id : "+book.getId();
    }
    
    
}