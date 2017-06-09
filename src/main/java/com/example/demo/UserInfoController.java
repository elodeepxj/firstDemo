package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by PengXiaoJie on 2017/6/8.
 */

@RestController
public class UserInfoController {
    @Resource
    UserInfoDAO userInfoDAO;

    @RequestMapping("/selectInfo")
    public String selectInfo(int id){

        UserInfo userInfo = userInfoDAO.findUserInfoById(id);
        if(null == userInfo){
            return "no user info";
        }else {
            return userInfo.getUserName()+" "+userInfo.getSex();
        }

    }

    @RequestMapping("/selectInfoByName")
    public Object selectInfoByName(String userName){
        UserInfo userInfo = userInfoDAO.findUserInfoByUserName(userName);
        if(null == userInfo ){
            return "no user info";
        }else {
            return userInfo.getUserName()+" + "+userInfo.getSex();
        }
    }

    @RequestMapping("/queryCount")
    public long queryCount(){
        long l = userInfoDAO.count();
        return l;
    }
}
