package project_test.jinstudy;

import javax.print.attribute.SetOfIntegerSyntax;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.*;






public class JsonSample {
	public static void CallCenter() {
		JSONArray agents = new JSONArray();
		JSONObject agent001 = new JSONObject();
		JSONObject json_sample = new JSONObject();
		
		//agent		
		agent001.put("name", "김민지");
		agent001.put("team","A팀");
		agent001.put("status","대기");
		agent001.put("callCount",15);
		
		
		JSONArray skills1 = new JSONArray();
		skills1.put("상담");
		skills1.put("불만처리");
		skills1.put("IT");	
		agent001.put("skill",skills1);
		
		JSONObject agent002 = new JSONObject();		
		agent002.put("name","박철수");
		agent002.put("team","B팀");
		agent002.put("status","통화중");
		agent002.put("callCount",23);
		
		JSONArray skills2 = new JSONArray();
		skills2.put("상담");
		skills2.put("영업");
		agent002.put("skill",skills2);
		
		JSONObject currentCall = new JSONObject();
		currentCall.put("customerld","custmomer123");
		currentCall.put("problemType","결제");
		currentCall.put("callDuration", 120);
		agent002.put("currentcall", currentCall);
		
		JSONObject agent003 = new JSONObject();
		agent003.put("name","이수현");
		agent003.put("team","A팀");
		agent003.put("status","휴식");
		agent003.put("callCount",8);
		agent003.put("restReason", "개인 용무");
		
		JSONArray skills3 = new JSONArray();
		skills3.put("상담");
		skills3.put("불만처리");
		agent003.put("skill",skills3);		
		//agent 출력
		agents.put(agent001);
		agents.put(agent002);
		agents.put(agent003);		
		//team 
		JSONArray teams = new JSONArray();
		JSONObject teamA = new JSONObject();
		teamA.put("name","A팀");
		teamA.put("leader","김민지");
		teamA.put("memberCount", 2);
		
		JSONObject teamB = new JSONObject();
		teamB.put("name","박철수");
		teamB.put("leader","박철수");
		teamB.put("memberCount", 1);
		//teams 출력
		teams.put(teamA);
		teams.put(teamB);
		
		//callStatistics
		JSONObject callStatistics = new JSONObject();
		callStatistics.put("totalCalls",46);
		callStatistics.put("averageCallDuration",95);
		
		JSONArray problemTypes = new JSONArray();
		problemTypes.put("결제");
		problemTypes.put("배송");
		problemTypes.put("환불");
		problemTypes.put("기타");
		callStatistics.put("problemTypes", problemTypes);	
		
		//callcenter
		JSONObject callCenter = new JSONObject();
		callCenter.put("name","브리지텍 콜센터");
		callCenter.put("location", "서울시 강남구");
		callCenter.put("agents", agents);
		callCenter.put("teams", teams);
		callCenter.put("callStatistics", callStatistics);
		json_sample.put("callCenter", callCenter);		
		//출력	
		System.out.println(json_sample.toString(2));	
					
	}
}