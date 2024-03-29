package com.spring.securityJWT.service;

import com.spring.securityJWT.repository.OurUsersRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OurUsersDetailsService implements UserDetailsService {

    private final OurUsersRepo ourUsersRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ourUsersRepo.findByEmail(username).orElseThrow();
    }
}
