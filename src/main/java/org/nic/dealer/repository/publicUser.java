package org.nic.dealer.repository;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class publicUser {
    @Id
    Long userId;
    String userName;
    String password;




}
