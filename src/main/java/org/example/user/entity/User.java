package org.example.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


/**
 * User实体类
 */
@Data
public class User {
    @TableId(type = IdType.AUTO)

    private String userid;

    private String username;

}
