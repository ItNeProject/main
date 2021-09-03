package com.itne.service;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itne.dao.FindDao;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FindService {
	@Autowired
	private FindDao findDao;
	
	public String findId(String phone) {
		return findDao.selectUserId(phone);
	}

	public String findPw(String id, String phone) {
		return findDao.selectUserPw(id, phone);
	}

}
