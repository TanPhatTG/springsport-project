package com.springsport.common.common;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity {
    @Id // define (PRIMARY KEY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id auto generate
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdate", updatable = false)
    private Date createdate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modifydate")
    private Date modifydate;

    @PrePersist
    protected void onCreate() {
        createdate = new Date();
        modifydate = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        modifydate = new Date();
    }
}
