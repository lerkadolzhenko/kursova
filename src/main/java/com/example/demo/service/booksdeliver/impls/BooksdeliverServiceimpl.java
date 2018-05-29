package com.example.demo.service.booksdeliver.impls;

import com.example.demo.model.Booksdeliver;
import com.example.demo.model.Booksdeliver;
import com.example.demo.repository.BooksDeliverRepository;
import com.example.demo.service.booksdeliver.interfaces.IBooksdeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksdeliverServiceimpl implements IBooksdeliverService {
    @Autowired
    BooksDeliverRepository BooksdeliverRepository;

    @Override
    public Booksdeliver insertBooksdeliver(Booksdeliver booksdeliver) {
        return BooksdeliverRepository.save(booksdeliver);
    }

    @Override
    public Booksdeliver getBooksdeliver(int id) {
        return BooksdeliverRepository.getOne(id);

    }

    @Override
    public Booksdeliver updateBooksdeliver(Booksdeliver booksdeliver) {
        return BooksdeliverRepository.save(booksdeliver);
    }

    @Override
    public void deleteBooksdeliver(int id) {
         BooksdeliverRepository.deleteById(id);
    }

    @Override
    public List<Booksdeliver> getAll() {
        return BooksdeliverRepository.findAll();
                /*stream()
                .collect(Collectors.toList());*/
    }
}