package gcy.mapper;
import gcy.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by min on 2018/4/20.
 */
@Mapper
public interface UserMapper {
    /**
     * 插入数据 sql
     * @param user 数据源
     * @return
     */
    int insertUserInfo(@Param("user") User user);
}
