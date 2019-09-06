package com.zb.pojo.forum;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Talk implements Serializable {
    //
    private String ID;
    //
    private String title;
    //
    private String content;
    //
    private TalkType tType;
    //
    private String userId;
    //
    private Integer likeNum;
    //
    private Integer commentNum;
    //
    private Integer status;
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
    public void setTType (TalkType  tType){
        this.tType=tType;
    }
    public  TalkType getTType(){
        return this.tType;
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
}
