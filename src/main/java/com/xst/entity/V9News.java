package com.xst.entity;
// Generated 2016-2-20 22:32:32 by Hibernate Tools 3.2.2.GA

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * V9News generated by hbm2java
 */
@Entity
@Table(name = "v9_news", schema = "db_xst")
public class V9News implements java.io.Serializable {

	private Integer id;
	private short catid;
	private short typeid;
	private String title;
	private String style;
	private String thumb;
	private String keywords;
	private String description;
	private boolean posids;
	private String url;
	private byte listorder;
	private byte status;
	private boolean sysadd;
	private boolean islink;
	private String username;
	private int inputtime;
	private int updatetime;

	private V9NewsData v9NewsData;

	public V9News() {
	}

	public V9News(short catid, short typeid, String title, String style,
			String thumb, String keywords, String description, boolean posids,
			String url, byte listorder, byte status, boolean sysadd,
			boolean islink, String username, int inputtime, int updatetime,V9NewsData v9NewsData) {
		this.catid = catid;
		this.typeid = typeid;
		this.title = title;
		this.style = style;
		this.thumb = thumb;
		this.keywords = keywords;
		this.description = description;
		this.posids = posids;
		this.url = url;
		this.listorder = listorder;
		this.status = status;
		this.sysadd = sysadd;
		this.islink = islink;
		this.username = username;
		this.inputtime = inputtime;
		this.updatetime = updatetime;
		this.v9NewsData=v9NewsData;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "catid", nullable = false)
	public short getCatid() {
		return this.catid;
	}

	public void setCatid(short catid) {
		this.catid = catid;
	}

	@Column(name = "typeid", nullable = false)
	public short getTypeid() {
		return this.typeid;
	}

	public void setTypeid(short typeid) {
		this.typeid = typeid;
	}

	@Column(name = "title", nullable = false, length = 80)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "style", nullable = false, length = 24)
	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Column(name = "thumb", nullable = false, length = 100)
	public String getThumb() {
		return this.thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	@Column(name = "keywords", nullable = false, length = 40)
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Column(name = "description", nullable = false, length = 16777215)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "posids", nullable = false)
	public boolean isPosids() {
		return this.posids;
	}

	public void setPosids(boolean posids) {
		this.posids = posids;
	}

	@Column(name = "url", nullable = false, length = 100)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "listorder", nullable = false)
	public byte getListorder() {
		return this.listorder;
	}

	public void setListorder(byte listorder) {
		this.listorder = listorder;
	}

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	@Column(name = "sysadd", nullable = false)
	public boolean isSysadd() {
		return this.sysadd;
	}

	public void setSysadd(boolean sysadd) {
		this.sysadd = sysadd;
	}

	@Column(name = "islink", nullable = false)
	public boolean isIslink() {
		return this.islink;
	}

	public void setIslink(boolean islink) {
		this.islink = islink;
	}

	@Column(name = "username", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "inputtime", nullable = false)
	public int getInputtime() {
		return this.inputtime;
	}

	public void setInputtime(int inputtime) {
		this.inputtime = inputtime;
	}

	@Column(name = "updatetime", nullable = false)
	public int getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id", nullable = true)
	public V9NewsData getV9NewsData(){
		return v9NewsData;
	}
	public void setV9NewsData(V9NewsData v9NewsData){
		this.v9NewsData=v9NewsData;
	}

}