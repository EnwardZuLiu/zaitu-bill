package com.zaitu.service;

import com.zaitu.dao.UserDao;
import com.zaitu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public User login(User user) {
        if ((user == null) || (user.getUserName() == null) || (user.getPassword() == null)) {
            return null;
        }
        return this.userDao.login(user.getUserName(), user.getPassword());
    }

    public List<User> findAll(){
        return userDao.getAll(User.class);
    }
}
