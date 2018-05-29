package com.example.demo.service.bookstatus.impls;

import com.example.demo.model.Bookstatus;
import com.example.demo.model.Bookstatus;
import com.example.demo.repository.BookStatusRepository;
import com.example.demo.service.bookstatus.interfaces.IBookstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookstatusServiceimpl implements IBookstatusService {
    @Autowired
    BookStatusRepository BookstatusRepository;

    @Override
    public Bookstatus insertBookstatus(Bookstatus bookstatus) {
        return BookstatusRepository.save(bookstatus);
    }

    @Override
    public Bookstatus getBookstatus(int id) {
        return BookstatusRepository.getOne(id);

    }

    @Override
    public Bookstatus updateBookstatus(Bookstatus bookstatus) {
        return BookstatusRepository.save(bookstatus);
    }

    @Override
    public void deleteBookstatus(int id){ BookstatusRepository.deleteById(id);
    }

    @Override
    public List<Bookstatus> getAll() {
        return BookstatusRepository.findAll();
                /*stream()
                .collect(Collectors.toList());*/
    }
}
