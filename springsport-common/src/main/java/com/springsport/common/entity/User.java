package com.springsport.common.entity;

import com.springsport.common.common.AbstractEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

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
