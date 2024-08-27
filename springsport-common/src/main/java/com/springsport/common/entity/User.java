package com.springsport.common.entity;

import com.springsport.common.common.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User extends AbstractEntity {
    @Column(name = "user_name" ,nullable = false, length = 100)
    private String userName;

    @Column(name = "first_name" ,nullable = false, length = 150)
    private String firstName;

    @Column(name = "last_name" ,nullable = false, length = 150)
    private String lastName;

    @Column(name = "date_of_birth" ,nullable = false)
    private Date dateBirth;

    @Column(name = "is_active" ,nullable = false)
    private boolean isActive;

    //Role

    @Column(name = "password_salt" ,nullable = false)
    private String password;

    @Column(name = "pass_reset_token" ,nullable = false)
    private String passResetToken;

    @Column(name = "pass_reset_expiration" ,nullable = false)
    private String passResetExp;

    @Column(name = "is_verified" ,nullable = false)
    private boolean isVerified;

    @Column(name = "last_login_time" ,nullable = false)
    private Date lastLogTime;

    @Column(name = "last_login_ip" ,nullable = false)
    private String lastLogIP;

}
