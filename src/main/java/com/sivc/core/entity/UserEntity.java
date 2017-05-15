package com.sivc.core.entity;

import javax.persistence.*;
import java.security.Timestamp;

@javax.persistence.Table(name = "SIVC_User")
@Entity
public class UserEntity {
    private Long userId;
    private RoleEntity role;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Timestamp createdDate;
    private Timestamp modifiedDate;

    @javax.persistence.Column(name = "userId")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sivc_user_userid_seq")
    @SequenceGenerator(name="sivc_user_userid_seq", sequenceName="sivc_user_userid_seq", allocationSize=1)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @javax.persistence.Column(name = "firstName")
    @Basic
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @javax.persistence.Column(name = "middleName")
    @Basic
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    @javax.persistence.Column(name = "lastName")
    @Basic
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @javax.persistence.Column(name = "email")
    @Basic
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @javax.persistence.Column(name = "phone")
    @Basic
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @javax.persistence.Column(name = "password")
    @Basic
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToOne
    @JoinColumn(name = "roleId")
    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    @javax.persistence.Column(name = "createdDate")
    @Basic
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @javax.persistence.Column(name = "modifiedDate")
    @Basic
    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
