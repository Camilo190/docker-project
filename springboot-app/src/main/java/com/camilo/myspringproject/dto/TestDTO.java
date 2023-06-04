package com.camilo.myspringproject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class TestDTO implements Serializable {
    private static final long serialVersionUID = 734436464931488786L;

    private Long id;

    private String data;

}
