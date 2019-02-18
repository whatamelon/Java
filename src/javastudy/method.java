package javastudy;

public class method {

	public static void main(String[] args) {
		int[] scoresA = { 10,20,30,20};
		int[] scoresB = { 90,30,20};
		int[] scoresC = { 10,10,10,10,10};
		
		int sum = 0;
		for (int i = 0; i < scoresA.length; i++)
		{ sum += scoresA[i];
		
		}
		System.out.println("Æò±Õ : " + sum / scoresA.length);
		
		sum = 0;
		for (int i = 0; i < scoresB.length; i++)
		{ sum += scoresB[i];
		
		}
		System.out.println("Æò±Õ : " + sum / scoresB.length);

		sum = 0;
		for (int i = 0; i < scoresC.length; i++)
		{ sum += scoresC[i];
		
		}
		System.out.println("Æò±Õ : " + sum / scoresC.length);
	}

}
// return °ªÀÌ ¾øÀ» °æ¿ì void ÇÔ¼ö¸¦ ¼±¾ðÇÏ¸é µÊ.