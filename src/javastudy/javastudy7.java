package javastudy;

public class javastudy7 {

	public static void main(String[] args) {
		String[][] classSchedule = { 
				{ "�����ͺ��̽�", "�ڹ�", "HTML", "��ǻ�Ͱ���", "�ڷᱸ��" },
				{ "�����ͺ��̽�", "�ڹ�", "HTML", "��ǻ�Ͱ���", "�ڷᱸ��" }, 
				{ "�����ͺ��̽�", "�ڹ�", "HTML", "��ǻ�Ͱ���", "�˰���" },
				{ "�����ͺ��̽�", "�ڹ�", "�ڹٽ�ũ��", "��ǻ�Ͱ���", "�˰���" }, 
				{ "C ���", "�ü��", "�ڹٽ�ũ��", "��ǻ�Ͱ���", "���̽�" },
				{ "C ���", "�ü��", "�ڹٽ�ũ��", "��ǻ�Ͱ���", "���̽�" } 
		};
		
		for (String[] classes : classSchedule) {
			for (String subject : classes) {
				System.out.print(subject);
			}
			System.out.println("");
		}
	}
}