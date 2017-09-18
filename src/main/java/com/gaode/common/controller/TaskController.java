package com.gaode.common.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaode.common.bean.UserInfo;

@RestController
@RequestMapping("/task")
public class TaskController {

@Autowired 
UserInfo conn;

@RequestMapping(value = {"/",""})
public String hellTask(){
//    String userName = conn.getUsername();
    System.out.println("the config are "+conn);
    return "hello task !!";
}

}