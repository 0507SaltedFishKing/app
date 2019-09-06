package com.zb.pojo.forum;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Forum implements Serializable {
    //
    private String ID;
    //
    private String title;
    //
    private String content;
    //
    private ForumType fType;
    //
    private String userId;
    //
    private Integer likeNum;
    //
    private Integer commentNum;
    //
    private Integer status;
    //
    private String keys;
    //get set 方法
    public void setID (String  ID){
        this.ID=ID;
    }
    public  String getID(){
        return this.ID;
    }
    public void setTitle (String  title){
        this.title=title;
    }
    public  String getTitle(){
        return this.title;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setFType (ForumType  fType){
        this.fType=fType;
    }
    public  ForumType getFType(){
        return this.fType;
    }
    public void setUserId (String  userId){
        this.userId=userId;
    }
    public  String getUserId(){
        return this.userId;
    }
    public void setLikeNum (Integer  likeNum){
        this.likeNum=likeNum;
    }
    public  Integer getLikeNum(){
        return this.likeNum;
    }
    public void setCommentNum (Integer  commentNum){
        this.commentNum=commentNum;
    }
    public  Integer getCommentNum(){
        return this.commentNum;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
    public void setKeys (String  keys){
        this.keys=keys;
    }
    public  String getKeys(){
        return this.keys;
    }
}
