package com.tsp.belle.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsp.belle.admin.dao.AdminDao;
import com.tsp.belle.admin.entity.Admin;
import com.tsp.belle.admin.service.AdminService;
import org.springframework.stereotype.Service;

/**
 * 后台管理员(Admin)表服务实现类
 *
 * @author likewindz
 * @since 2020-04-16 16:04:42
 */
@Service("adminService")
public class AdminServiceImpl extends ServiceImpl<AdminDao, Admin> implements AdminService {

}