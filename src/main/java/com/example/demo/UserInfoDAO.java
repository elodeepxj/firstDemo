package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by PengXiaoJie on 2017/6/8.
 */

@Transactional
@Repository
public interface UserInfoDAO extends CrudRepository<UserInfo, Integer>{
    UserInfo findUserInfoById(int id);

//    List<UserInfo> findByUserName(String userName);
    UserInfo findUserInfoByUserName(String userName);

   long count();
}
