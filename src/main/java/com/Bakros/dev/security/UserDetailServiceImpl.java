package com.Bakros.dev.security;

import com.Bakros.dev.model.User;
import com.Bakros.dev.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Servicio que a través del Repositorio rescata los datos de un usuario y genera una instancia de
 * UserDetailsImpl.
 */

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    private String id = "Hello";
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public UserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        System.out.println("Calling from UserDetailServiceImpl.loadUserByUsername()");
        User user = userRepository.findOneByEmail(email).
                orElseThrow(()-> new UsernameNotFoundException("El usuario con "+email+" no existe."));

        return new UserDetailsImpl(user);
    }


    @PostConstruct
    public void init(){

    }
}
