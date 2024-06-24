package com.Bakros.dev;

import com.Bakros.dev.model.Contact;
import com.Bakros.dev.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.Bakros.dev.service.MainServiceImpl;

import java.util.List;


//localhost:8080/contactos/
//localhost:8080/login

/*
Request in login
{
    "email":"emi@test.cl",
    "password":"admin"
}
*/
@SpringBootApplication
public class ExampleJwtApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(ExampleJwtApplication.class, args);

		MainServiceImpl mainService = (MainServiceImpl) context.getBean("DefaultService");

		mainService.saveDefaultUsers();
		mainService.saveDafaultContacts();

		List<User> users = mainService.findAllUser();
		for (User user: users) {
			System.out.println(user.toString());
		}

		List<Contact> contacts = mainService.findAllContacts();
		for (Contact contact: contacts) {
			System.out.println(contact.toString());
		}

	}

}
