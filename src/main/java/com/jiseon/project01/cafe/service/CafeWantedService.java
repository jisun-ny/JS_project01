package com.jiseon.project01.cafe.service;

import javax.servlet.http.HttpServletRequest;

import com.jiseon.project01.cafe.dto.CafeWantedDto;

public interface CafeWantedService {
	
	public void saveContent(CafeWantedDto dto, HttpServletRequest request);
	public void getList(HttpServletRequest request);
	public void getDetail(HttpServletRequest request);
	public void updateContent(CafeWantedDto dto, HttpServletRequest request);
	public void deleteContent(int num, HttpServletRequest request);
	public void getData(HttpServletRequest request); //글을 수정하기 위해서 정보를 불러오기

}
