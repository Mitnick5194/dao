package com.ajie.dao.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbUser {
	private Integer id;

	private String name;

	private String password;

	private String nickname;

	private String synopsis;

	/** 枚举 1男2女0保密 */
	private String sex;

	private String phone;

	private String email;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createtime;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date lastactive;

	private String roleids;

	private String header;

	private Integer mark;

	private String token;

	public TbUser() {

	}

	public TbUser(String name, String password) {
		this.password = password;
		this.name = name;
		this.createtime = new Date();
		this.lastactive = new Date();
		this.mark = 1;// 见 com.ajie.sso.user.UserService.STATE_NORMALs
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/*public String getPassword() {
		return password;
	}*/

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis == null ? null : synopsis.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getLastactive() {
		return lastactive;
	}

	public void setLastactive(Date lastactive) {
		this.lastactive = lastactive;
	}

	public String getRoleids() {
		return roleids;
	}

	public void setRoleids(String roleids) {
		this.roleids = roleids == null ? null : roleids.trim();
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header == null ? null : header.trim();
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public boolean contrastPassword(String password) {
		if (null == password)
			return false;
		return password.equals(this.password);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{id:").append(id).append(",");
		sb.append("name:").append(name).append(",");
		sb.append("email:").append(email).append(",");
		sb.append("header:").append(header).append(",");
		sb.append("createtime:").append(createtime).append(",");
		sb.append("nickname:").append(nickname).append(",");
		sb.append("phone:").append(phone).append(",");
		sb.append("sex:").append(sex).append(",");
		sb.append("mark:").append(mark).append(",");
		sb.append("lastactive:").append(lastactive).append(",");
		sb.append("roleids:").append(roleids).append(",");
		sb.append("synopsis:").append(synopsis).append("}");
		return sb.toString();
	}
}