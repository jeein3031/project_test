package project_test.jinstudy;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONParserConfiguration;

public class DataJson {
	public static void printJson() {
		JSONArray names = new JSONArray();
		JSONObject name1 = new JSONObject();
		
		name1.put("이름","최지인");
		name1.put("나이","몇살이지?");
		name1.put("키",170);
		name1.put("좋아하는것","독서");
		name1.put("성인여부",true);
		
		JSONArray family = new JSONArray();
		family.put("오현종");
		family.put("오한율");
		name1.put("가족관계", family);
		
		JSONObject name2 = new JSONObject();
		name2.put("이름","최지영");
		name2.put("나이","40대");
		name2.put("키",173);
		name2.put("좋아하는것","독서");
		name2.put("성인여부",true);
		
		JSONArray familys = new JSONArray();
		familys.put("정지상");
		familys.put("정은우");
		name2.put("가족관계", familys);
		
		names.put(name1);
		names.put(name2);
		
		System.out.println(names.toString(1));
	}		
		
			
		public static void printJsons() {		
		JSONArray characters = new JSONArray();
		JSONObject character1 = new JSONObject();
		character1.put("이름","남도일");
		character1.put("나이",18);
		character1.put("별명","코난");
		character1.put("싫어하는것","검은조직");
		
		JSONArray favourite = new JSONArray();
		favourite.put("유미란");
		favourite.put("스케이드보드");
		favourite.put("시계");
		favourite.put("나비넥타이");
		
		character1.put("좋아하는것",favourite);
		
		JSONObject character2 = new JSONObject();
		character2.put("이름","유미란");
		character2.put("나이",18);
		character2.put("별명","머리에뿔");
		character2.put("싫어하는것","갑자기사라지는 남도일");
		
		JSONArray favourites = new JSONArray();
		favourites.put("소꿉친구 도일");
		favourites.put("태권도");
		favourites.put("로맨틱");
		
		character2.put("좋아하는것",favourites);
		
		characters.put(character1); //남도일
		characters.put(character2); //유미란
		
		System.out.println(characters.toString(1));
		
	}

			
		}




