package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import org.hibernate.sql.ast.Clause;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Entity

//this means that all repository that uses this entity
//then all the queries will concatenate this with this clause
@Table(name = "users")
//@Where(clause = "is_deleted=false") // SELECT * FROM users WHERE id = 4 AND is_deleted = false;
//we cant use it bcuz we need to find also tasks of deleted employees
public class User extends BaseEntity {

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String userName;

    private String passWord;
    private boolean enabled;
    private String phone;
    @ManyToOne
    private Role role;

    @Enumerated(EnumType.STRING)
    private Gender gender;



}
