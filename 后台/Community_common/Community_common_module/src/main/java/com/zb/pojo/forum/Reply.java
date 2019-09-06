package com.zb.pojo.forum;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Reply implements Serializable {
    //
    private String id;
    //
    private String commentId;
    //
    private String replyId;
    //
    private Integer replyType;
    //
    private String content;
    //
    private String fromUserid;
    //
    private String toUserid;
    //
    private Integer status;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setCommentId (String  commentId){
        this.commentId=commentId;
    }
    public  String getCommentId(){
        return this.commentId;
    }
    public void setReplyId (String  replyId){
        this.replyId=replyId;
    }
    public  String getReplyId(){
        return this.replyId;
    }
    public void setReplyType (Integer  replyType){
        this.replyType=replyType;
    }
    public  Integer getReplyType(){
        return this.replyType;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setFromUserid (String  fromUserid){
        this.fromUserid=fromUserid;
    }
    public  String getFromUserid(){
        return this.fromUserid;
    }
    public void setToUserid (String  toUserid){
        this.toUserid=toUserid;
    }
    public  String getToUserid(){
        return this.toUserid;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
}
