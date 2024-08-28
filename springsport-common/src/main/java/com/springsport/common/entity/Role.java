package com.springsport.common.entity;

import com.springsport.common.common.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ROLES")
public class Role extends AbstractEntity {

    @Column(name = "role_code",unique = true, nullable = false, length = 10)
    private String roleCod;

    @Column(name = "role_name",unique = true, nullable = false, length = 100)
    private String roleName;

    @Column(name = "role_disc",unique = true, nullable = false, length = 300)
    private String roleDisc;

    @Column(name = "is_active" ,nullable = false)
    private boolean isActive;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}
