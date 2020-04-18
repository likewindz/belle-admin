package com.tsp.belle.admin.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 后台管理员(Admin)表实体类
 *
 * @author likewindz
 * @since 2020-04-16 16:04:42
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
public class Admin extends Model<Admin> {
    //id
    private Integer id;
    //用户名
    private String userName;
    //密码
    private String userPassword;
    
    private Date createDate;
    
    private Date modifyDate;
    
    private Integer isDelete;
    
    private Integer version;
    //0: 管理员 1: 维护者
    private Integer roleLevel;



    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }