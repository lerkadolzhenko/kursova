package com.example.demo.service.bookstatus.impls;

import com.example.demo.DAO.bookstatus.impls.BookstatusDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Bookstatus;
import com.example.demo.model.Bookstatus;
import com.example.demo.service.bookstatus.interfaces.IBookstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookstatusServiceimpl implements IBookstatusService {
    @Autowired
    BookstatusDAOimpl BookstatusDAO;

    @Override
    public Bookstatus insertBookstatus(Bookstatus bookstatus) {
        return BookstatusDAO.insertBookstatus(bookstatus);
    }

    @Override
    public Bookstatus getBookstatus(int id) {
        return BookstatusDAO.getBookstatus(id);

    }

    @Override
    public Bookstatus updateBookstatus(Bookstatus bookstatus) {
        return BookstatusDAO.updateBookstatus(bookstatus);
    }

    @Override
    public Bookstatus deleteBookstatus(int id) {
        return BookstatusDAO.deleteBookstatus(id);
    }

    @Override
    public List<Bookstatus> getAll() {
        return BookstatusDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}
