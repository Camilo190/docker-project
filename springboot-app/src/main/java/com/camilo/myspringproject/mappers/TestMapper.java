package com.camilo.myspringproject.mappers;

import com.camilo.myspringproject.dto.TestDTO;
import com.camilo.myspringproject.model.Test;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TestMapper {
    TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

    Test toTest(TestDTO testDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(target = "data", source = "data")
    TestDTO toTestDTO(Test test);
}
