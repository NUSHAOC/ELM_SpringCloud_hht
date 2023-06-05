package com.shm.user.service;


import com.shm.user.dataobject.UserInfo;

public interface UserService {

	UserInfo findByOpenid(String openid);
}
