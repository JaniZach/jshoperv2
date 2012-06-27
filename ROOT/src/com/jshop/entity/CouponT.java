package com.jshop.entity;

// Generated 2012-6-26 13:53:16 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * CouponT generated by hbm2java
 */
public class CouponT implements java.io.Serializable {

	private String cid;
	private String ctitle;
	private String cimage;
	private Date endtime;
	private String details;
	private Date createtime;
	private Date modifytime;
	private Date begintime;
	private String creatorid;
	private double lat;
	private double lng;
	private int zoom;
	private int readcount;
	private int starsum;
	private int starusersum;
	private int replycount;
	private int gousersum;
	private String coupontypename;
	private String coupontypeid;

	public CouponT() {
	}

	public CouponT(String cid, String ctitle, String cimage, Date endtime,
			String details, Date createtime, Date modifytime, Date begintime,
			String creatorid, double lat, double lng, int zoom, int readcount,
			int starsum, int starusersum, int replycount, int gousersum,
			String coupontypename, String coupontypeid) {
		this.cid = cid;
		this.ctitle = ctitle;
		this.cimage = cimage;
		this.endtime = endtime;
		this.details = details;
		this.createtime = createtime;
		this.modifytime = modifytime;
		this.begintime = begintime;
		this.creatorid = creatorid;
		this.lat = lat;
		this.lng = lng;
		this.zoom = zoom;
		this.readcount = readcount;
		this.starsum = starsum;
		this.starusersum = starusersum;
		this.replycount = replycount;
		this.gousersum = gousersum;
		this.coupontypename = coupontypename;
		this.coupontypeid = coupontypeid;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCtitle() {
		return this.ctitle;
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

	public String getCimage() {
		return this.cimage;
	}

	public void setCimage(String cimage) {
		this.cimage = cimage;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return this.lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public int getZoom() {
		return this.zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	public int getReadcount() {
		return this.readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public int getStarsum() {
		return this.starsum;
	}

	public void setStarsum(int starsum) {
		this.starsum = starsum;
	}

	public int getStarusersum() {
		return this.starusersum;
	}

	public void setStarusersum(int starusersum) {
		this.starusersum = starusersum;
	}

	public int getReplycount() {
		return this.replycount;
	}

	public void setReplycount(int replycount) {
		this.replycount = replycount;
	}

	public int getGousersum() {
		return this.gousersum;
	}

	public void setGousersum(int gousersum) {
		this.gousersum = gousersum;
	}

	public String getCoupontypename() {
		return this.coupontypename;
	}

	public void setCoupontypename(String coupontypename) {
		this.coupontypename = coupontypename;
	}

	public String getCoupontypeid() {
		return this.coupontypeid;
	}

	public void setCoupontypeid(String coupontypeid) {
		this.coupontypeid = coupontypeid;
	}

}
