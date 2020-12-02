package ch09.ch04;

public class HourMan extends Employee{
	//근무시간, 시급
	int workHour, moneyPerHour;

	public HourMan(String name, int workHour, int moneyPerHour) {
		super(name);
		this.workHour = workHour;
		this.moneyPerHour = moneyPerHour;
	}

	//메소드 재정의
	@Override
	int computePay() {
		sal=workHour*moneyPerHour;
		return sal;
	}
	
	

}
