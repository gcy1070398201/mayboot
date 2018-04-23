package gcy.service;


import gcy.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by min on 2018/4/20.
 */
@Service
public interface UserService {

    /**
     * 添加一个用户
     * @param user
     * @return
     */
    int insertUser(User user);
}
