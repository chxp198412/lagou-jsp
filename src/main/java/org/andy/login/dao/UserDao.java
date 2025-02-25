package org.andy.login.dao;


import org.andy.login.bean.User;

public interface UserDao {
    // 自定义抽象方法描述登录功能的实现
    public abstract User userLogin(User user);
}
