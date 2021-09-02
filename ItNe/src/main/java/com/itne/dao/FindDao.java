package com.itne.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface FindDao {
	
	/** 아이디 찾기*/
	public String selectUserId(String phone);

	/** 비밀번호 찾기 */
	public String selectUserPw(String id, String phone);
	
}
	

