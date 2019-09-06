package com.zb.pojo.user;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class UsersLoginLog implements Serializable {
    //
    private String loginId;
    //
    private String usercode;
    //
    private String logintime;
    //get set 方法
    public void setLoginId (String  loginId){
        this.loginId=loginId;
    }
    public  String getLoginId(){
        return this.loginId;
    }
    public void setUsercode (String  usercode){
        this.usercode=usercode;
    }
    public  String getUsercode(){
        return this.usercode;
    }
    public void setLogintime (String  logintime){
        this.logintime=logintime;
    }
    public  String getLogintime(){
        return this.logintime;
    }
}
