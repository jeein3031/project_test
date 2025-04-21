package project_test.jinstudy;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JsonSampleMap {

	public static void callMap() {
		JSONObject callCenter = new JSONObject();
		callCenter.put("name","브리지텍 콜센터");
		callCenter.put("location","서울시 영등포구");
	
		//상담원 정보
		List<Map<String, Object>> agentsList = new ArrayList<>();
		//상담원1
		Map<String, Object> agent1 = new HashMap<>();
		agent1.put("id","agent001");
		agent1.put("name","유미란");
		agent1.put("team","A팀");
		agent1.put("status","대기");
		agent1.put("skills", new JSONArray().put("상담").put("불만처리").put("IT"));
		agent1.put("callCount",15);
		agentsList.add(agent1);
		//상담원2
		Map<String, Object> agent2 = new HashMap<>();
		agent2.put("id","agent002");
		agent2.put("name","남도일");
		agent2.put("team","B팀");
		agent2.put("status","통화중");
		agent2.put("skills", new JSONArray().put("상담").put("영업"));
		agent2.put("callCount",23);
		agent2.put("currentCall", new JSONObject()
				.put("customerId","customer123")
				.put("problemType","결제")
				.put("callDuration", 120));	
		agentsList.add(agent2);
		//상담원3
		Map<String, Object> agent3 = new HashMap<>();
		agent3.put("id","agent003");
		agent3.put("name","유명한");
		agent3.put("team","A팀");
		agent3.put("status","휴식");
		agent3.put("skills", new JSONArray().put("상담").put("불만처리"));
		agent3.put("callCount",8);
		agent3.put("restReason","개인용무");
		agentsList.add(agent3);
		
		//JSONArray 로 변환
        JSONArray agents = new JSONArray();
        for (Map<String, Object> agent : agentsList) {
            agents.put(new JSONObject(agent));
		}
		callCenter.put("agents", agents);
		
		//팀정보
		JSONArray teams = new JSONArray();
		//팀A
		JSONObject teamA = new JSONObject();
		teamA.put("name","A팀");
		teamA.put("leader","유미란");
		teamA.put("memberCount",2);
		teams.put(teamA);
		//팀B
		JSONObject teamB = new JSONObject();
		teamB.put("name","B팀");
		teamB.put("leader","남도일");
		teamB.put("memberCount",1);
		teams.put(teamB);
		callCenter.put("teams", teams);
		
		//통계정보
		JSONObject callStatistics = new JSONObject();
		callStatistics.put("totalCalls", 46);
		callStatistics.put("averageCallDuration", 95);
		callStatistics.put("problemTypes", new JSONArray().put("결제").put("배송").put("환불").put("기타"));	
		callCenter.put("callStatistics",callStatistics);

		//최종 출력
		System.out.println("전체 콜센터 정보:");
		System.out.println(callCenter.toString(2));			
		//문제1(총통화수 출력)
		int totalCallCount = 0; //총 통화수를 저장할 변수
		for (int i = 0; i <agents.length(); i++) {  //JSONArray agents 의 크기만큼 반복.
			JSONObject agent = agents.getJSONObject(i); // JSONArray안에 있는 i번째 상담원 정보 꺼내서 JSONObject로저장
			int count = agent.getInt("callCount"); // agent안에 있는 callcount값을 꺼내서 int타입으로 저장
			totalCallCount += count;
		}
		System.out.println("1.총 통화수 합계: " + totalCallCount);
		//문제2 (남도일 스킬출력)
		String targetName = "남도일";
		JSONArray skills = null;
		for (int i = 0; i <agents.length(); i++) {
			JSONObject agent = agents.getJSONObject(i);
			if (agent.getString("name").equals(targetName)) {
				skills = agent.getJSONArray("skills");
				break;
			}			
		}
		//스킬출력
		if(skills != null) {
			System.out.println("1." + targetName + "의스킬:" + skills.toString());
		}else {
			System.out.println(targetName + "을 찾을수 없습니다.");
		}
		//문제3(대기상담원 count 출력)
		String readyname = ""; // 대기상담원 이름 저장할 변수
		for (int i = 0; i <agents.length(); i++) {
			JSONObject agent = agents.getJSONObject(i); // 인덱스사용해 상담원 객체 가져옴
			String status = agent.getString("status"); // 상태를 문자열로 가져옴
			if (status.equals("대기")) { // 대기 상태인지 확인
				readyname = agent.getString("name"); // 대기상담원 이름 저장
				break; // 첫번쨰 대기 상담원 찾으면 루프 종료
			}		
		}
		System.out.println("3.대기 상담원:" + readyname);
		//문제4 (통화중인 상담원 출력)
		String onthephone = "";
		for (int i = 0; i <agents.length(); i++) {
			JSONObject agent = agents.getJSONObject(i);
			String status = agent.getString("status");
			if (status.equals("통화중")) { 
				onthephone = agent.getString("name");
				break;
			}
		}
		System.out.println("4.통화중인 상담원:" + onthephone);
	}
}