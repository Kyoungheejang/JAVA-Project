package model.rec;

import java.sql.Date;

public class WorkerVO {
	int workerCode;
	String workerID, workerPW, workerName, workerAddr;
	String workerTel, workerAge, workerRnum;
	String careerDetail, workerEmail, careerPeriod;
	int skillCode;
	Date careerSdate,careerEdate;
	
	
	public WorkerVO() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	// 유승민
	public WorkerVO(int workerCode, 
			String workerID, String workerPW, String workerName, String workerAddr,
			String workerTel, String workerAge, String workerRnum,
			String careerDetail, String workerEmail, String careerPeriod,
			int skillCode) {
		
		this.workerCode = workerCode;
		this.workerID = workerID;
		this.workerPW = workerPW;
		this.workerName = workerName;
		this.workerAddr = workerAddr;
		this.workerTel = workerTel;
		this.workerAge = workerAge;
		this.workerRnum = workerRnum;
		this.careerDetail = careerDetail;
		this.workerEmail = workerEmail;
		this.careerPeriod = careerPeriod;
		this.skillCode = skillCode;
		
	}

	
	//오버라이딩 - 장경희 (workerCode 제외)
	public WorkerVO(
			String workerID, String workerPW, String workerName, String workerAddr,
			String workerTel, String workerAge, String workerRnum,
			String workerEmail, int skillCode) {

		this.workerID = workerID;
		this.workerPW = workerPW;
		this.workerName = workerName;
		this.workerAddr = workerAddr;
		this.workerTel = workerTel;
		this.workerAge = workerAge;
		this.workerRnum = workerRnum;
		this.workerEmail = workerEmail;
		this.skillCode = skillCode;

	}

	//@오버라이딩 - 장경희
	public WorkerVO(
			String workerName, 
			String workerPW, 
			String workerTel, 
			String workerEmail, 
			String workerAddr,
			String workerID,
			String workerAge,
			String workerRnum) { 

		this.workerName = workerName;
		this.workerPW = workerPW;
		this.workerTel = workerTel;
		this.workerEmail = workerEmail;
		this.workerAddr = workerAddr;
		this.workerID = workerID;
		this.workerAge = workerAge;
		this.workerRnum = workerRnum;

	}

	//@오버라이딩 - 장경희
	public WorkerVO(String workerPW) {
		this.workerPW = workerPW;
	}
	
	public Date getCareerSdate() {
		return careerSdate;
	}

	public void setCareerSdate(Date careerSdate) {
		this.careerSdate = careerSdate;
	}

	public Date getCareerEdate() {
		return careerEdate;
	}

	public void setCareerEdate(Date careerEdate) {
		this.careerEdate = careerEdate;
	}

	public int getWorkerCode() {
		return workerCode;
	}

	public void setWorkerCode(int workerCode) {
		this.workerCode = workerCode;
	}

	public String getWorkerID() {
		return workerID;
	}

	public void setWorkerID(String workerID) {
		this.workerID = workerID;
	}

	public String getWorkerPW() {
		return workerPW;
	}

	public void setWorkerPW(String workerPW) {
		this.workerPW = workerPW;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getWorkerAddr() {
		return workerAddr;
	}

	public void setWorkerAddr(String workerAddr) {
		this.workerAddr = workerAddr;
	}

	public String getWorkerTel() {
		return workerTel;
	}

	public void setWorkerTel(String workerTel) {
		this.workerTel = workerTel;
	}

	public String getWorkerAge() {
		return workerAge;
	}

	public void setWorkerAge(String workerAge) {
		this.workerAge = workerAge;
	}

	public String getWorkerRnum() {
		return workerRnum;
	}

	public void setWorkerRnum(String workerRnum) {
		this.workerRnum = workerRnum;
	}

	public String getCareerDetail() {
		return careerDetail;
	}

	public void setCareerDetail(String careerDetail) {
		this.careerDetail = careerDetail;
	}

	public String getWorkerEmail() {
		return workerEmail;
	}

	public void setWorkerEmail(String workerEmail) {
		this.workerEmail = workerEmail;
	}

	public String getCareerPeriod() {
		return careerPeriod;
	}

	public void setCareerPeriod(String careerPeriod) {
		this.careerPeriod = careerPeriod;
	}

	public int getSkillCode() {
		return skillCode;
	}

	public void setSkillCode(int skillCode) {
		this.skillCode = skillCode;
	}
	
	
	
}
