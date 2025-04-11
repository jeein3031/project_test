package project_test.jinstudy;

import org.json.JSONArray;
import org.json.JSONObject;

public class DataJson {
	public static void printJson() {
		JSONObject parent = new JSONObject();
		JSONArray childrens =  new JSONArray();
		
		JSONObject child = new JSONObject();
			child.put("id", "min0320");
			child.put("password", "1234");
			child.put("name", "홍길동");
			child.put("phone", "01012345678");
			childrens.put(child);
				
		JSONObject child2 = new JSONObject();
			child2.put("id","hun5327");
			child2.put("name", "장길산");
			child2.put("phone", "01077778888");
			childrens.put(child2);
				
			parent.put("회원정보", childrens);
			
			System.out.println(parent.toString());		
	}	

	public static void main(String[] args) {
		printJson();
	}
}
