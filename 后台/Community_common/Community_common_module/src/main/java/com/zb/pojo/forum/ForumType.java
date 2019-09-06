package com.zb.pojo.forum;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class ForumType implements Serializable {
    //
    private Integer fid;
    //
    private String fname;
    //get set 方法
    public void setFid (Integer  fid){
        this.fid=fid;
    }
    public  Integer getFid(){
        return this.fid;
    }
    public void setFname (String  fname){
        this.fname=fname;
    }
    public  String getFname(){
        return this.fname;
    }
}
