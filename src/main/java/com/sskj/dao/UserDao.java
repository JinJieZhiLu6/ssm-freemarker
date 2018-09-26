/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: UserDao
 * <p>
 * Author:   shunshikj-30
 * <p>
 * Date:     2018/9/25 15:56
 * <p>
 * Description: 用户持久层
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.sskj.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sskj.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户持久层〉
 *
 * @author shunshikj-30

 * @create 2018/9/25

 * @since 1.0.0

 */
@Repository
public interface UserDao extends BaseMapper<User> {

    User getUserById(Integer id);

}

