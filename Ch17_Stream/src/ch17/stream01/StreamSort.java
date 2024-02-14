package ch17.stream01;

import java.util.ArrayList;
import java.util.List;

public class StreamSort {

	public static void main(String[] args) {
		List<String> nameList = new  ArrayList<>();
		
		nameList.add("B");
		nameList.add("F");
		nameList.add("A");
		
		nameList.stream().
		sorted().
		forEach(s -> System.out.println(s+","));

	}

}
