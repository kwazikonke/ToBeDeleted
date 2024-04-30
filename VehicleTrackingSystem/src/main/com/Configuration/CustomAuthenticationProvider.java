package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{

 @Autowired
 private UserDetailsService userDetailsService;

 @Override
 public Authentication authentication(Authentication authentication)throws  AuthenticationException {
 
String username = authentication.getName();
String password = authentication.getCredentials().toString();

UserDetails userDetails = userDetailsService.loadUserByUsername(username);

if (passwordEncoder.matches(password, userDetails.getPassword())) {
            // If authentication succeeds, return a fully populated authentication token
            return new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
        } else {
            // If authentication fails, throw an AuthenticationException
            throw new BadCredentialsException("Invalid username or password");
        }
 }
@Override
public boolean supports(Class<?> authentication) {
return authentication.equals(UsernamePasswordAuthenticationToken.class;
    }
}