package com.ehome2u.ems.model;

import com.ehome2u.ems.enums.Role;
import jakarta.persistence.*;

//Following value is need be inserted to the database tables at first
//INSERT INTO EMP_LOC_ROLES(name) VALUES('MPO');
//INSERT INTO EMP_LOC_ROLES(name) VALUES('SMPO');
//INSERT INTO EMP_LOC_ROLES(name) VALUES('TM');
//INSERT INTO EMP_LOC_ROLES(name) VALUES('RSM');
//INSERT INTO EMP_LOC_ROLES(name) VALUES('DSM');

@Entity
@Table(name = "EMP_LOC_ROLES")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "NAME",length = 20)
    private Role name;

    public UserRole() {

    }
    public UserRole(Role name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Role getName() {
        return name;
    }

    public void setName(Role name) {
        this.name = name;
    }
}
