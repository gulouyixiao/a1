package com.curriculum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.curriculum.mapper.UserMapper;
import com.curriculum.model.po.User;
import com.curriculum.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author gulouyixiao
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
