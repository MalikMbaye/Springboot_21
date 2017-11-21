package com.example.demo;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
