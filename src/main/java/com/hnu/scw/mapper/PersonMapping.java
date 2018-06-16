package com.hnu.scw.mapper;

import com.hnu.scw.model.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * function : 针对Person实体进行的crud操作
 */
@Mapper
public interface PersonMapping {
    /**
     * 添加person数据
     * @param person
     */
    @Insert("insert into person (name) values(#{name})")
    public void addPerson(Person person);

    /**
     * 根据id查询到person数据
     * @param id
     * @return
     */
    @Select("select * from person where id = #{id}")
    public Person getPersonById(Integer id);
}
