package com.exam;

public class ScoreBean3 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//������
	public ScoreBean3(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	public int getTot() {
		return kor+eng+math;
	}
	public int getAvg() {
		return (kor+eng+math)/3;
	}
	public String getGrade() {
		String grade="";
		switch((kor+eng+math)/3/10){
		case 10	:  
		case 9	:	grade="A����";break;
		case 8	:	grade="B����";break;
		case 7	:	grade="C����";break;
		default	: 	grade= "F����";
		}
		return grade;
			
		}

	
}
