package com.zb.pojo.forum;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class TalkType implements Serializable {
    //
    private Integer TID;
    //
    private String tname;
    //get set 方法
    public void setTID (Integer  TID){
        this.TID=TID;
    }
    public  Integer getTID(){
        return this.TID;
    }
    public void setTname (String  tname){
        this.tname=tname;
    }
    public  String getTname(){
        return this.tname;
    }
}
