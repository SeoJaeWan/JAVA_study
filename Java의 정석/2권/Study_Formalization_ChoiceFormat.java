package hi2;

import java.text.ChoiceFormat;

public class Study_Formalization_ChoiceFormat {

	public static void main(String[] args) {
		
		double[] limits = {60, 70, 80, 90};
		String[] grades = {"D","C","B","A"};
		
		String pattern = "60#D|70#C|80<B|90#A";  // #은 이상의 개념이고 < 은 초과의 개념이기 때문에 
		                                         // 90은 A이고 80은 C이다.
		int[] scores = {100,90,80,95,88,70,52,60,70};
		
		ChoiceFormat form = new  ChoiceFormat(limits,grades);
		ChoiceFormat form2 = new ChoiceFormat(pattern);
		
		for(int i = 0; i < scores.length ; i++) {
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
		
		for(int i = 0; i < scores.length ; i++) {
			System.out.println(scores[i] + " : " + form2.format(scores[i]));
		}

	}

}
