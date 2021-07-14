package com.datacanvas.superion.mapper;

import com.datacanvas.superion.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    User getAllUser();

}
