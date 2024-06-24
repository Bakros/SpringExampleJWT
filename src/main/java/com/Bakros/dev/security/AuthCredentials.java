package com.Bakros.dev.security;

/**
 * Clase que permite mappear el body:
 * {
 *     "email":"emi@test.cl",
 *     "password":"admin"
 * }
 * A una clase. Solo es usado en JWTAuthenticationFilter.
 */
public class AuthCredentials {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
