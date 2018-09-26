/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: UserServiceImpl
 * <p>
 * Author:   shunshikj-30
 * <p>
 * Date:     2018/9/25 17:46
 * <p>
 * Description: 用户业务实现层
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.sskj.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sskj.dao.UserDao;
import com.sskj.entity.User;
import com.sskj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户业务实现层〉
 *
 * @author shunshikj-30

 * @create 2018/9/25

 * @since 1.0.0

 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(Integer id) {
        User user = userDao.getUserById(id);
        return user;
    }

    public List<User> getUsers(){
        return userDao.selectList(null);
    }

    public IPage<User> getUserByPage(){
        Page<User> p = new Page<User>(1,2);
        IPage<User> page = userDao.selectPage(p, null);
        return page;
    }
}
