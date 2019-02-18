package javastudy;

public class javastudy7 {

	public static void main(String[] args) {
		String[][] classSchedule = { 
				{ "데이터베이스", "자바", "HTML", "컴퓨터개론", "자료구조" },
				{ "데이터베이스", "자바", "HTML", "컴퓨터개론", "자료구조" }, 
				{ "데이터베이스", "자바", "HTML", "컴퓨터개론", "알고리즘" },
				{ "데이터베이스", "자바", "자바스크립", "컴퓨터개론", "알고리즘" }, 
				{ "C 언어", "운영체제", "자바스크립", "컴퓨터개론", "파이썬" },
				{ "C 언어", "운영체제", "자바스크립", "컴퓨터개론", "파이썬" } 
		};
		
		for (String[] classes : classSchedule) {
			for (String subject : classes) {
				System.out.print(subject);
			}
			System.out.println("");
		}
	}
}