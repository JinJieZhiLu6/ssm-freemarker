/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: UserService
 * <p>
 * Author:   shunshikj-30
 * <p>
 * Date:     2018/9/25 17:45
 * <p>
 * Description: 用户业务层
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.sskj.service;


import com.sskj.entity.User;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户业务层〉
 *
 * @author shunshikj-30

 * @create 2018/9/25

 * @since 1.0.0

 */

public interface UserService {

    User getUserById(Integer id);
}

