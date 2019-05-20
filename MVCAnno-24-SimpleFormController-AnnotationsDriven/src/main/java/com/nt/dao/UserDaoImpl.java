package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBo;

@Repository("dao")
public class UserDaoImpl implements UserDao {
	private final static String QUERY_LOGIN="SELECT COUNT(*) FROM USERLIST WHERE NAME=? and PWD=?";
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public int authenticate(UserBo bo) {
		int count=jt.queryForObject(QUERY_LOGIN, Integer.class,bo.getName(),bo.getPwd());
		return count;
	}

}
