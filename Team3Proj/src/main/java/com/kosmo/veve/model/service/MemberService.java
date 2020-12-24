package com.kosmo.veve.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.kosmo.veve.model.MemberDTO;
import com.kosmo.veve.model.MemberFileDTO;
import com.kosmo.veve.model.MemberFollowDTO;


public interface MemberService {
	
	//로그인 용]
		boolean isLogin(Map map);
		boolean idCheck(String userID);
		//목록용]
		List<MemberDTO> selectList(Map map);
		//전체 레코드 수]
		int getTotalRecord(Map map);
		//상세보기용]
		MemberDTO selectOne(Map map);
		//입력/수정/삭제용]
		int insert(Map map);
		int delete(Map map);
		int update(Map map);
		//회원 사진 가져오기용]
		MemberFileDTO selectFile(String userID);
		//팔로잉 레코드 수 가져오기
		int getFollowing(String userID);
		//팔로워 레코드 수 가져오기
		int getFollower(String userID);
		//팔로잉 회원리스트 가져오기
		List<MemberFollowDTO> getFollowingInfo(String userID);
		//팔로워 회원리스트 가져오기
		List<MemberFollowDTO> getFollowerInfo(String userID);

}
