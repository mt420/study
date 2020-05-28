package servlet.service;

import servlet.pojo.User;

public interface UserService {
    /**
     * 一个业务一个方法
     * 目前有三个，注册，登陆，查询用户名
     */
    public void registerUser(User user);

    public User login(User user);

    public boolean existUsername(String username);
}
