package ch17.stream01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamCalc {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		
		nameList.add("홍길동");
		nameList.add("알렉ddd");
		nameList.add("톨스토ddd");
		nameList.add("김수한dddd");
		nameList.add("김수한dddddddddddddddd");
		nameList.add("홍길동");
		
		nameList.stream()				//스트림 객체
		.filter(s->s.length() >= 5 && s.length() < 10)		// 중간연산 (가공)
		.forEach(s -> System.out.print(s + ", "));	//최종연산
	}

}
