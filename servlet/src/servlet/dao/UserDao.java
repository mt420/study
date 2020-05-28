package servlet.dao;

import servlet.pojo.User;

public interface UserDao {



    /**
     *
     * @param Username
     * @return
     */
    public User queryUserByUsername(String username);

    public User queryUserByUsernameAndPassword(String username,String password);
    public int saveUser(User user);

}
