package com.ajie.dao.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbConfig {

	/** 唯一id */
	private String id;
	/** 创建时间 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	/** 最后修改时间 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date lastModifyTime;
	/** 版本号 */
	private String version;
	/** 配置内容 */
	private String config;
	/** 修改次数 */
	private int modifyCount;

	/** 修改理由 */
	private String note;

	public String getId() {
		return id;
	}

	public TbConfig() {

	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public int getModifyCount() {
		return modifyCount;
	}

	public void setModifyCount(int modifyCount) {
		this.modifyCount = modifyCount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
