package com.itne.service;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itne.dao.JoinDao;
import com.itne.dto.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JoinService {
	@Autowired
	private JoinDao joinDao;

	public int addUser(User dto) {
		dto.setGrade("G");
		int result = joinDao.insertUser(dto);
		return result; 
	}
	
	public int checkId(String id) {
		return joinDao.checkId(id);
	}

}
