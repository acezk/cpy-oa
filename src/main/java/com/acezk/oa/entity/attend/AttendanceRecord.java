package com.acezk.oa.entity.attend;

public class AttendanceRecord {
	
	private int id;
	
	private int userId;
	
	private String attendDate;
	
	private String type; //考勤类型
	
	private String signTime;
	
	private String signAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAttendDate() {
		return attendDate;
	}

	public void setAttendDate(String attendDate) {
		this.attendDate = attendDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSignTime() {
		return signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getSignAddress() {
		return signAddress;
	}

	public void setSignAddress(String signAddress) {
		this.signAddress = signAddress;
	}
	
	
}
