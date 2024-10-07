package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String username);

    @Transactional //so this method is intercepted by a code of try catch that makes
    //sure that the deletion is successful in both UI and DB(commit) otherwise it rollback
    void deleteByUserName(String username);
    List<User> findByRoleDescriptionIgnoreCase(String Description);
}