package org.example.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * UserMapper 接口
 * </p>
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
