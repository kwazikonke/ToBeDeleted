package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LoginRequest {

  private String username;
  private String password;


  //getters and Setters
}

public JwtAuthenticationResponse{

 private String accessToken;

public JwtAuthenticationResponse(String accessToken){
    
   this.accessToken = acessToken;
  }

  //getters and setters
}
