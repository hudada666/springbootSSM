package cn.study.microboot.dao;

import cn.study.microboot.vo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper(namespace="cn.study.microboot.dao.IDeptDAO")
public interface IDeptDAO {
   List<Dept> findAll();
}
