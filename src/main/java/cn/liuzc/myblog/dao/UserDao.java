package cn.liuzc.myblog.dao;

import cn.liuzc.myblog.model.User;

import java.util.List;

public interface UserDao {
    /**
     * 添加用户的方法
     * @param record
     * @return
     */
    public int insertUser(User record);

    /**
     * 查询用户的方法
     * @return
     */
    public List<User> selectUsers();
}
