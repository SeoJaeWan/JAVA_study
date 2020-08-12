package hi2;

import java.text.MessageFormat;
import java.text.ParseException;

public class Study_Formalization_MessageFormat {

	public static void main(String[] args) {
		
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',{2},''{3}'');";
		Object[][] arguments = {
				{"이자바","02-123-1234","27","07-09"},
				{"김프로","032-333-1234","33","10-07"}
		};
		
		for(int i = 0; i < arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);    //  msg의 {0}, ... {3} 에 순서대로 arguments의 값을 넣어준다.
			System.out.println(result);
		}
		
		String[] data = {
				"INSERT INTO CUST_INFO VALUES ('이자바','02-123-1234',27,'07-09');",
				"INSERT INTO CUST_INFO VALUES ('김프로','032-333-1234',33,'10-07');"
		};
		
		String pattern = "INSERT INTO CUST_INFO VALUES (''{0}'',''{1}'',{2},''{3}'');";
		MessageFormat mf = new MessageFormat(pattern);
		
		for(int i = 0; i < data.length; i++) {
			try {
				Object[] objs = mf.parse(data[i]);   // {0}, ... ,{3}의 위치에 해당되는 데이터를 뽑아 낼수도 있다.
				
				for(int j = 0; j < objs.length; j++)
					System.out.print(objs[j] + ",");
			} catch (ParseException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			System.out.println();
		}
		
	}

}
