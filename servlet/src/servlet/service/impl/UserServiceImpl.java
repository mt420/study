package servlet.service.impl;

import servlet.dao.UserDao;
import servlet.dao.impl.BaseDao;
import servlet.dao.impl.UserDaoImpl;
import servlet.pojo.User;
import servlet.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();

    @Override
    public void registerUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        if(userDao.queryUserByUsername(username)==null) {

            return false;
        }
        else {return true;}
    }
}
