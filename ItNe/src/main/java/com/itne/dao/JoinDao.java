package com.itne.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itne.dto.User;



@Mapper
public interface JoinDao {

	/** 회원가입 */
	public int insertUser(User dto);
	
	/** 아이디 중복체크 */
	public int checkId(String id);
}
	

