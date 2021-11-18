package Codes.datas;

public class StudentData {

	private String name;
	private int birthYear;
	private String address;

	@Override
	public String toString() {
		return String.format("이름 : %s, 출생연도 : %d, 거주지 : %s", this.name, this.birthYear, this.address);
	}

	@Override
	public boolean equals(Object obj) {

//		기본 equals : 두 인스턴스가 위치한 메모리 주소가 같은가? 
//		오버라이딩 -> 같다는 기준을 변경 => 이름만 같으면 같은 학생

//		obj에 들어있는 인스턴스가 StudentData 타입이 맞는지? 다르면 같지 않다, false 리턴

		if (!(obj instanceof StudentData))
			;
		{
			return false;
		}

//		object obj에 학생이 담겨있을 때만 정상 동작
//		StudentData otherStudent = (StudentData) obj;
//		return this.name == otherStudent.name;

	}

	public StudentData(String name, int birthYear, String address) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
