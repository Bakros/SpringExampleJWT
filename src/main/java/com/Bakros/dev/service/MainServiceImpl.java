package com.Bakros.dev.service;

import com.Bakros.dev.model.Contact;
import com.Bakros.dev.model.User;
import com.Bakros.dev.repository.ContactRepository;
import com.Bakros.dev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("DefaultService")
public class MainServiceImpl implements MainService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ContactRepository contactRepository;

    @Transactional
    @Override
    public List<User> saveDefaultUsers(){
        List<User> userList = new ArrayList();

        userList.add(userRepository.save(new User("Seba","seba@test.cl")));
        userList.add(userRepository.save(new User("Emi","emi@test.cl")));

        return userList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public List<Contact> saveDafaultContacts(){
        List<Contact> contacts = new ArrayList<Contact>();

        contacts.add(contactRepository.save(new Contact("Seba","123123123","seba@test.com" )));
        contacts.add(contactRepository.save(new Contact("Naty","123123123","naty@test.com" )));
        contacts.add(contactRepository.save(new Contact("Seba","123123123","mily@test.com" )));
        return contacts;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Contact> findAllContacts(){return contactRepository.findAll();}
}
