package com.steve.generalTest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class School {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    String name;

    Long area;

}
