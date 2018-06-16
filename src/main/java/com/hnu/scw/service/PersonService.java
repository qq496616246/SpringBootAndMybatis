package com.hnu.scw.service;

import com.hnu.scw.mapper.PersonMapping;
import com.hnu.scw.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author scw
 * @create 2018-01-03 10:40
 * @desc 进行对person实体操作的service，这里就不写接口了，但是实际开发中，应该要面向接口编程
 **/
@Service
public class PersonService {
    @Autowired
    public PersonMapping personMapping ;

    /**
     * 添加person数据
     * @param person
     */
    public void addPerson(Person person){
        personMapping.addPerson(person);
    }

    /**
     * 根据id获取person数据
     * @param id
     * @return
     */
    public Person getPersonById(Integer id){
       return personMapping.getPersonById(id);
    }
}
