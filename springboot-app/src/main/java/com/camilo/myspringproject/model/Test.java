package com.camilo.myspringproject.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Test implements Serializable {
    @Serial
    private static final long serialVersionUID = 5618615707248856853L;

    private Long id;

    private String data;
}
