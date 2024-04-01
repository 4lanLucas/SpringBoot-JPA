package com.AlanProductions.ProjectCourse.services;

import com.AlanProductions.ProjectCourse.entities.User;
import com.AlanProductions.ProjectCourse.repositories.UserRepository;
import com.AlanProductions.ProjectCourse.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> optional = userRepository.findById(id);
        return optional.orElseThrow(()-> new ResourceNotFoundException(id));
    }
    public User insert(User user){
        return userRepository.save(user);
    }
    public void delete(Long id){
        userRepository.deleteById(id);
    }
    public User update(Long id, User user){
        User entity = userRepository.getReferenceById(id);
        updateData(entity,user);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());

    }
}
