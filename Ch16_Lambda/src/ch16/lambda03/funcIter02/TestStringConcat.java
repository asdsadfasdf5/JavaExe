package ch16.lambda03.funcIter02;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConcat concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		// lambda 
		StringConcat concat2 = (s,v)-> System.out.println(s + ", "+v);
		concat2.makeString(s1, s2);
		
		//익명객체로 구현
		StringConcat concat3 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
			};
		};
		concat3.makeString(s1, s2);
		
		StringConcat concat4 = (s, v) -> System.out.println(s+", "+v);
		showMakeString(concat4);
		
		showMakeString((s,v)->System.out.println(s+", "+v));
	}
	
	public static void showMakeString(StringConcat concat) {
		concat.makeString("헬로","월드");
	}

}
