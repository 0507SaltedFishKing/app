package com.zb.pojo.user;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Users implements Serializable {
	//
	private String uid;
	//
	private String usercode;
	//
	private String password;
	//
	private String uicon;
	//
	private Integer identity;
	//
	private String nickName;
	//
	private String phone;
	//
	private String autograph;
	//
	private String gender;

	private Integer score;

	private String like_keys_json;

	private String unlike_keys_json;

	private String last_logintime;

	private int login_status;


	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUicon() {
		return uicon;
	}

	public void setUicon(String uicon) {
		this.uicon = uicon;
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAutograph() {
		return autograph;
	}

	public void setAutograph(String autograph) {
		this.autograph = autograph;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getLike_keys_json() {
		return like_keys_json;
	}

	public void setLike_keys_json(String like_keys_json) {
		this.like_keys_json = like_keys_json;
	}

	public String getUnlike_keys_json() {
		return unlike_keys_json;
	}

	public void setUnlike_keys_json(String unlike_keys_json) {
		this.unlike_keys_json = unlike_keys_json;
	}

	public String getLast_logintime() {
		return last_logintime;
	}

	public void setLast_logintime(String last_logintime) {
		this.last_logintime = last_logintime;
	}

	public int getLogin_status() {
		return login_status;
	}

	public void setLogin_status(int login_status) {
		this.login_status = login_status;
	}
}
