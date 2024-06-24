package com.Bakros.dev.security;

import com.Bakros.dev.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

/**
 * https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/userdetails/UserDetails.html
 * Provides core user information.
 * Implementations are not used directly by Spring Security for security purposes. They simply store user
 * information which is later encapsulated into Authentication objects. This allows non-security related user
 * information (such as email addresses, telephone numbers etc) to be stored in a convenient location.
 *
 * Concrete implementations must take particular care to ensure the non-null contract detailed for each
 * method is enforced. See User for a reference implementation (which you might like to extend or use in
 * your code).
 */
public class UserDetailsImpl implements UserDetails {
    private final User user;

    public UserDetailsImpl(User user) {
        this.user = user;
    }

    @Override
    // Esto sirve para asignar roles.
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }

    public String getNombre(){
        return user.getName();
    }
}
