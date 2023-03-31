package com.example.photozaruvajproject.repositories;

import com.example.photozaruvajproject.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
