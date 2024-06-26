package model.rec;

import java.sql.Date;

public class CareerVO {

	String careerName, careerSdate, careerEdate, careerDetail ;
	int workerCode, workerCareerCode;

	int careerCode;
	
	Date careerSdateD,careerEdateD;

	public CareerVO() {

	}

	// 유승민   
	public void CareerVO(int workerCode, int workerCareerCode, String careerName, String careerSdate, String careerEdate, String careerDetail) {

		this.workerCode = workerCode;
		this.workerCareerCode = workerCareerCode;
		this.careerName = careerName;
		this.careerSdate = careerSdate;
		this.careerEdate = careerEdate; 
		this.careerDetail = careerDetail;

	}

	//@오버라이딩-장경희
	public void CareerVO(String careerName, String careerSdate, String careerEdate, String careerDetail) {

		this.careerName = careerName;
		this.careerSdate = careerSdate;
		this.careerEdate = careerEdate; 
		this.careerDetail = careerDetail;

	}

	public CareerVO(int workerCode, int careerCode, String careerName, String careerSdate, String careerEdate, String careerDetail) {
		
		this.workerCode = workerCode;
		this.careerCode = careerCode;
		this.careerName = careerName;
		this.careerSdate = careerSdate;
		this.careerEdate = careerEdate; 
		this.careerDetail = careerDetail;
		
	}

	public CareerVO(int workerCode, int careerCode, String careerName, Date careerSdateD, Date careerEdateD, String careerDetail) {
		
		this.workerCode = workerCode;
		this.careerCode = careerCode;
		this.careerName = careerName;
		this.careerSdateD = careerSdateD;
		this.careerEdateD = careerEdateD; 
		this.careerDetail = careerDetail;
		
	}

	//@오버라이딩-장경희
	public CareerVO(int careerCode, String careerName, String careerSdate, String careerEdate, String careerDetail) {
		
		this.careerCode = careerCode;
		this.careerName = careerName;
		this.careerSdate = careerSdate;
		this.careerEdate = careerEdate; 
		this.careerDetail = careerDetail;
		
	}

	public CareerVO(String careerName, String careerSdate, String careerEdate, String careerDetail) {
		
		this.careerName = careerName;
		this.careerSdate = careerSdate;
		this.careerEdate = careerEdate; 
		this.careerDetail = careerDetail;
		
	}

		
	public CareerVO(int careerCode,  String careerName, Date careerSdateD, Date careerEdateD, String careerDetail) {
		
		this.careerCode = careerCode;
		this.careerName = careerName;
		this.careerSdateD = careerSdateD;
		this.careerEdateD = careerEdateD; 
		this.careerDetail = careerDetail;
		
	}
	public CareerVO(String careerName, Date careerSdateD, Date careerEdateD, String careerDetail) {
		
		this.careerName = careerName;
		this.careerSdateD = careerSdateD;
		this.careerEdateD = careerEdateD; 
		this.careerDetail = careerDetail;
		
	}

	public int getCareerCode() {
		return careerCode;
	}

	public void setCareerCode(int careerCode) {
		this.careerCode = careerCode;
	}

	public String getCareerName() {
		return careerName;
	}


	public void setCareerName(String careerName) {
		this.careerName = careerName;
	}


	public String getCareerSdate() {
		return careerSdate;
	}


	public void setCareerSdate(String careerSdate) {
		this.careerSdate = careerSdate;
	}


	public String getCareerEdate() {
		return careerEdate;
	}


	public void setCareerEdate(String careerEdate) {
		this.careerEdate = careerEdate;
	}


	public int getWorkerCode() {
		return workerCode;
	}


	public void setWorkerCode(int workerCode) {
		this.workerCode = workerCode;
	}


	public int getWorkerCareerCode() {
		return workerCareerCode;
	}


	public void setWorkerCareerCode(int workerCareerCode) {
		this.workerCareerCode = workerCareerCode;
	}


	public String getCareerDetail() {
		return careerDetail;
	}


	public void setCareerDetail(String careerDetail) {
		this.careerDetail = careerDetail;
	}


}