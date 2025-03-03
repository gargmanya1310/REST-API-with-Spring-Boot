package com.demo.springboot.firstrestapi.user;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>
{

    List<UserDetails> findByRole(String role);
}
