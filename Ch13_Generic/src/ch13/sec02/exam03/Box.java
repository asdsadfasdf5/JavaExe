package ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		//Object의 equals() 메소드로 content 필드값 비교
		
		return result;
	}
}
