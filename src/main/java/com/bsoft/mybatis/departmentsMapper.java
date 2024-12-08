package com.bsoft.mybatis;

import com.bsoft.entity.departments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface departmentsMapper {

    @Select("select * from departments")
    public List<departments> list();
}
