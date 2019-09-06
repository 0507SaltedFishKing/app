package com.zb.pojo.forum;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class LikeInfo implements Serializable {
    //
    private String ID;
    //
    private Integer isForum;
    //
    private Integer likeType;
    //
    private String likeUser;
    //
    private String targetUser;
    //
    private String composeId;
    //
    private Integer status;
    //get set 方法
    public void setID (String  ID){
        this.ID=ID;
    }
    public  String getID(){
        return this.ID;
    }
    public void setIsForum (Integer  isForum){
        this.isForum=isForum;
    }
    public  Integer getIsForum(){
        return this.isForum;
    }
    public void setLikeType (Integer  likeType){
        this.likeType=likeType;
    }
    public  Integer getLikeType(){
        return this.likeType;
    }
    public void setLikeUser (String  likeUser){
        this.likeUser=likeUser;
    }
    public  String getLikeUser(){
        return this.likeUser;
    }
    public void setTargetUser (String  targetUser){
        this.targetUser=targetUser;
    }
    public  String getTargetUser(){
        return this.targetUser;
    }
    public void setComposeId (String  composeId){
        this.composeId=composeId;
    }
    public  String getComposeId(){
        return this.composeId;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
}
