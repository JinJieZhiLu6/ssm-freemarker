/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: TestDB
 * <p>
 * Author:   shunshikj-30
 * <p>
 * Date:     2018/9/25 17:31
 * <p>
 * Description: 测试连接数据库
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sskj.entity.User;
import com.sskj.service.UserService;
import com.sskj.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试连接数据库〉
 *
 * @author shunshikj-30

 * @create 2018/9/25

 * @since 1.0.0

 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext.xml")
public class TestDB {

    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    public void testGetUser(){
        User user = userService.getUserById(1);
        System.out.println(user);

        List<User> users = userServiceImpl.getUsers();
        System.out.println(users);

        IPage<User> page = userServiceImpl.getUserByPage();
        System.out.println("current="+page.getCurrent());
        System.out.println("total="+page.getTotal());
        System.out.println("List<User>="+page.getRecords());
        System.out.println("page="+page.getPages());
    }

}
