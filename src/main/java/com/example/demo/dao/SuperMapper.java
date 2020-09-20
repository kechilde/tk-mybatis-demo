package com.example.demo.dao;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface SuperMapper<Student> extends Mapper<Student>, IdsMapper<Student>, InsertListMapper<Student> {
}
