package com.mktech.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mktech.entity.DbShaocheng;

@Repository
public interface DbShaochengDao {
	int deleteByPrimaryKey(Integer id);

	ArrayList<DbShaocheng> getTotal();

	int insert(DbShaocheng record);

	int insertSelective(DbShaocheng record);

	DbShaocheng selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(DbShaocheng record);

	int updateByPrimaryKey(DbShaocheng record);
}