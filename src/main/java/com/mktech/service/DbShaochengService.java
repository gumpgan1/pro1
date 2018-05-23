/**
 * @author Chnyge Lin
 */
package com.mktech.service;

import java.util.ArrayList;

import com.mktech.entity.DbShaocheng;

/**
 * @author Chnyge Lin
 * 
 */
public interface DbShaochengService {

	int deleteByPrimaryKey(Integer id);

	int insert(DbShaocheng record);

	ArrayList<DbShaocheng> getTotal();

	int insertSelective(DbShaocheng record);

	DbShaocheng selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(DbShaocheng record);

	int updateByPrimaryKey(DbShaocheng record);

	int insertDataByJson(String json);
}
