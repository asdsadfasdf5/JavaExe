package ch17.stream02;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		List<TravelCustomer> cList = new ArrayList<>();
		cList.add(new TravelCustomer("kim", 19, 100));
		cList.add(new TravelCustomer("lee", 25, 110));
		cList.add(new TravelCustomer("lim", 30, 50));
		
		System.out.println("--name print--");
		cList.stream()
		.map(c->c.getName())
		.forEach(s->System.out.print(s+","));
		System.out.println();
		System.out.println("--total price--");
		int total = cList.stream()
		.mapToInt(c->c.getPrice())
		.sum();
		System.out.println(total);
		
		System.out.println("--age 20 on and sort--");
		cList.stream()
		.filter(c->c.getAge() > 20)
		.map(c->c.getName())
		.sorted()
		.forEach(s->System.out.println(s));
	}

}
