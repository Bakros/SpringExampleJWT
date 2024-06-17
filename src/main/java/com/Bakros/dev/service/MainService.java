package com.Bakros.dev.service;

import com.Bakros.dev.model.Contact;
import com.Bakros.dev.model.User;

import java.util.List;

public interface MainService {
    List<User> saveDefaultUsers();
    List<User> findAllUser();
    List<Contact> saveDafaultContacts();
    List<Contact> findAllContacts();
}
