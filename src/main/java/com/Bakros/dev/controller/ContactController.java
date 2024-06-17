package com.Bakros.dev.controller;

import com.Bakros.dev.model.Contact;
import com.Bakros.dev.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contactos")
public class ContactController {
    @Autowired
    private MainService mainService;

    @GetMapping("/")
    public List<Contact> getAllContacts(){
        return mainService.findAllContacts();
    }



}
