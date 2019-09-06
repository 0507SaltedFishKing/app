package com.zb.pojo.forum;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Comment implements Serializable {
    //
    private String id;
    //
    private Integer isForum;
    //
    private String composeId;
    //
    private String content;
    //
    private String fromUserid;
    //
    private Integer status;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setIsForum (Integer  isForum){
        this.isForum=isForum;
    }
    public  Integer getIsForum(){
        return this.isForum;
    }
    public void setComposeId (String  composeId){
        this.composeId=composeId;
    }
    public  String getComposeId(){
        return this.composeId;
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
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
}
