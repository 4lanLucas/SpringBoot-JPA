package com.AlanProductions.ProjectCourse.repositories;

import com.AlanProductions.ProjectCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
