package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();
    UserDTO findByUserName(String username);
    void save(UserDTO user);
   // void deleteByUserName(String username);
    UserDTO update(UserDTO user);
  //deleting the user only from the UI not from the DB
    void delete(String username);
    List<UserDTO> listAllByRole(String role);



}
