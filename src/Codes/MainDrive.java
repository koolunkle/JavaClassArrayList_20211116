package Codes;

import java.util.ArrayList;
import java.util.List;

import Codes.datas.StudentData;

public class MainDrive {

	public static void main(String[] args) {

//		ArrayList 생성 : 목록을 담을 공간 생성.

		List<StudentData> studentList = new ArrayList<>();

//		목록 추가

		studentList.add(new StudentData("조경진", 1988, "서울시 동대문구"));
		StudentData std = new StudentData("김민성", 1998, "서울시 도봉구");
		studentList.add(std);

		studentList.add(0, new StudentData("김준기", 1996, "경기도 남양주시"));

		studentList.add(new StudentData("방우진", 1983, "경기도 고양시"));

		studentList.add(new StudentData("이아현", 1996, "서울시 동대문구"));

		studentList.add(new StudentData("차수나", 1980, "서울시 성북구"));

		studentList.add(new StudentData("김경식", 1992, "서울시 중랑구"));

//		목록 출력

//		3번 칸의 학생 하나만 뽑아서 출력

		StudentData selectedStudent = studentList.get(3);
		System.out.println(selectedStudent);

		System.out.println("=========================");

//		1번 칸 : 조경진 -> 학생 아님. 제거
//		studentList.remove(1);

		studentList.remove(new StudentData("조경진", 1988, "서울시 동대문구"));

//		목록 전부 제거
		studentList.clear();

//		for로 전부 출력

		for (StudentData data : studentList) {
			System.out.println(data);
		}

//		우리 반의 학생 수?
		System.out.println(studentList.size());

//		이아현이 포함되어있나? -> equals를 이름만으로 비교하는 것으로 설정 -> 생년/거주지 상관없이 찾아줌.

		System.out.println(studentList.contains(new StudentData("이아현", 1996, "서울시 동대문구")));

//		조경진은 몇번째?

		System.out.println(studentList.indexOf(new StudentData("조경진", 1988, "서울시 동대문구")));

	}

}
