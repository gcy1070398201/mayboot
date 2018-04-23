package gcy.service.imp;


import gcy.mapper.UserMapper;
import gcy.model.User;
import gcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by min on 2018/4/23.
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insertUserInfo(user);
    }
}
