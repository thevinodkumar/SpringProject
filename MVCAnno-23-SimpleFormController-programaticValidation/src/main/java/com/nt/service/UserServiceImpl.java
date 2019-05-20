package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserBo;
import com.nt.dao.UserDao;
import com.nt.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public String login(UserDto dto) {

		UserBo bo = new UserBo();
		BeanUtils.copyProperties(dto, bo);
		int count = dao.authenticate(bo);
		if (count != 0)
			return "valid credential";
		else
			return "invalid credential";
	}

}
