package com.hnu.scw.controller;

import com.hnu.scw.model.Person;
import com.hnu.scw.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author scw
 * @create 2018-01-03 10:31
 * @desc 测试SpringBoot整合Mybatis的controller层
 **/
@Controller
public class PersonController {

    @Autowired
    public PersonService personService;

    /**
     * 添加person数据
     * @param person
     * @return
     */
    @RequestMapping(value = "person/add")
    public String addPerson(Person person){
        personService.addPerson(person);
        return "fail";
    }

    /**
     * 根据ID查询数据
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "person/getperson")
    public String addPerson(Integer id , Model model){
        Person person = personService.getPersonById(id);
        model.addAttribute("person" , person);
        return "ok";
    }

}
