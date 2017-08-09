package com.acezk.oa.entity.attend;

public class AttendanceRule {
	
	private int id;
	
	private String punchInAM; //上午上班时间
	
	private String punchOutAM; //上午下班时间
	
	private String punchInPM;  //下午上班时间
	
	private String punchOutPM; //下午下班时间
	
	private String attendAddress; //考勤地址

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPunchInAM() {
		return punchInAM;
	}

	public void setPunchInAM(String punchInAM) {
		this.punchInAM = punchInAM;
	}

	public String getPunchOutAM() {
		return punchOutAM;
	}

	public void setPunchOutAM(String punchOutAM) {
		this.punchOutAM = punchOutAM;
	}

	public String getPunchInPM() {
		return punchInPM;
	}

	public void setPunchInPM(String punchInPM) {
		this.punchInPM = punchInPM;
	}

	public String getPunchOutPM() {
		return punchOutPM;
	}

	public void setPunchOutPM(String punchOutPM) {
		this.punchOutPM = punchOutPM;
	}

	public String getAttendAddress() {
		return attendAddress;
	}

	public void setAttendAddress(String attendAddress) {
		this.attendAddress = attendAddress;
	}
	
	
}
