package com.example.demo.service.books.impls;

import com.example.demo.model.Books;
import com.example.demo.repository.BooksRepository;
import com.example.demo.service.books.interfaces.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksServiceimpl implements IBooksService {

    @Autowired
    BooksRepository BooksRepository;

    @Override
    public Books insertBooks(Books books) {
        return BooksRepository.save(books);
    }

    @Override
    public Books getBooks(int id) {
        return BooksRepository.getOne(id);

    }

    @Override
    public Books updateBooks(Books books) {
        return BooksRepository.save(books);
    }

    @Override
    public void deleteBooks(int id) {
         BooksRepository.deleteById(id);
    }

    @Override
    public List<Books> getAll() {
        return BooksRepository.findAll();
                /*stream()
                .collect(Collectors.toList());*/
    }
}
