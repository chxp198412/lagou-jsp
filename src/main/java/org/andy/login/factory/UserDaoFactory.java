package org.andy.login.factory;


import org.andy.login.dao.UserDao;
import org.andy.login.dao.UserDaoImp;

public class UserDaoFactory {

    /**
     * 通过静态工程方法模式来实现UserDao实现类对象的创建并返回
     * @return
     */
    public static UserDao getUserDao() {
        return new UserDaoImp();
    }
}
