package com.sivc.core.entity;

import javax.persistence.*;
import java.security.Timestamp;

@Table(name = "ROLE")
@Entity
public class RoleEntity {
    private Long roleId;
    private String role;
    private String description;
    private Timestamp createdDate;
    private Timestamp modifiedDate;

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_roleid_seq")
    @SequenceGenerator(name="role_roleid_seq", sequenceName="role_roleid_seq", allocationSize=1)
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Column(name = "name")
    @Basic
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Column(name = "description")
    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Column(name = "createdDate")
    @Basic
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }


    @Column(name = "modifiedDate")
    @Basic
    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
