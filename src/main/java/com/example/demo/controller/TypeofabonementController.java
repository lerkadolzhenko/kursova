package com.example.demo.controller;

import com.example.demo.model.Typeofabonement;
import com.example.demo.repository.TypeOfAbonementRepository;
import com.example.demo.service.typeofabonement.impls.TypeofabonementServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class TypeofabonementController {

    /*TypeOfAbonementRepository typeOfAbonementRepository;

    @RequestMapping("/get")
    public List<Typeofabonement> getTypeOfAbonement()  {
        //return organizationService.getReservationOrganizations();
        return typeOfAbonementRepository.findAll();
    }

    @PostMapping("/insert")
    public Typeofabonement insertTypeOfAbonement(@RequestBody Typeofabonement typeofabonement){
        //return organizationService.insertReservationOrganization(organization);
        return typeOfAbonementRepository.save(typeofabonement);
    }
    @RequestMapping("/update")
    public Typeofabonement updateStoragePlace(@RequestBody Typeofabonement storagePlace,@RequestParam("id")int id)  {
        storagePlace.setIdtypeofabonement(id);
        return typeOfAbonementRepository.save(storagePlace);
        //return organizationService.updateReservationOrganization(organization);
    }

    @RequestMapping("/del")
    public void deleteStoragePlace(@RequestParam("id")int id)  {
        //organizationService.deleteReservationOrganization(id);
        typeOfAbonementRepository.deleteById(id);
    }*/
    @Autowired
    TypeofabonementServiceimpl TypeofabonementService;

    @RequestMapping("/Typeofabonement")
    public List<Typeofabonement> showTypeofabonement() {
        return TypeofabonementService.getAll();
    }

    @RequestMapping("/typeofabonement/insert")
    public Typeofabonement insert(@RequestBody Typeofabonement typeofabonement) {
        return TypeofabonementService.insertTypeofabonement(typeofabonement);
    }

    @RequestMapping("/typeofabonement")
    public List<Typeofabonement> getAll() {
        return TypeofabonementService.getAll();
    }

    @RequestMapping("/typeofabonement/get")
    public Typeofabonement getById(@RequestParam int id) {
        return TypeofabonementService.getTypeofabonement(id);
    }

    @RequestMapping("/typeofabonement/del")
    public void delete(@RequestParam("id") int id) {
        TypeofabonementService.deleteTypeofabonement(id);
    }

    @RequestMapping("/typeofabonement/update")
    public Typeofabonement insert(@RequestBody Typeofabonement typeofabonement,@RequestParam("id") int id) {
        typeofabonement.setIdtypeofabonement(id);
        return TypeofabonementService.updateTypeofabonement(typeofabonement);
    }
}
