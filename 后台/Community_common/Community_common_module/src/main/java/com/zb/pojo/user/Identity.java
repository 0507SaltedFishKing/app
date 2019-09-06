package com.zb.pojo.user;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Identity implements Serializable {
    //
    private Integer id;
    //
    private String identity;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setIdentity (String  identity){
        this.identity=identity;
    }
    public  String getIdentity(){
        return this.identity;
    }
}
