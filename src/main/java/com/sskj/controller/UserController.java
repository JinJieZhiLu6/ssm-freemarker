/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: UserController
 * <p>
 * Author:   shunshikj-30
 * <p>
 * Date:     2018/9/26 9:43
 * <p>
 * Description: 用户控制层
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.sskj.controller;


import com.sskj.entity.User;
import com.sskj.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户控制层〉
 *
 * @author shunshikj-30

 * @create 2018/9/26

 * @since 1.0.0

 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private  UserServiceImpl userService;

    @RequestMapping(value = "/get")
    public String getUsers(Model model){
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "user";
    }

}
