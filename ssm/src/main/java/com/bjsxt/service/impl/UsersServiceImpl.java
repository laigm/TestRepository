package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.springframework.stereotype.Service;

import com.bjsxt.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersMapper usersMapper;
	@Override
	public List<Users> show() {
		return usersMapper.selAll();
	}

}
