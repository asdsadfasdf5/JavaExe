package ch17.stream01;

public class Example {

	public static void main(String[] args) {
		Thread thread = new Thread(
				()->{
					System.out.println("thread start");
					System.out.println("thread start");
					System.out.println("thread start");
				}
		        );
		        thread.start();

	}
	 class Button {
		//정적 멤버 인터페이스(함수형 인터페이스)
	    @FunctionalInterface
	    public static interface ClickListener {
	    	void onClick();
		}
	    private ClickListener clickListener;
	    //
	    public void setClickListener(ClickListener clickListener) {
	    this.clickListener = clickListener;
	    }
	    //
	    public void click(){
	 		this.clickListener.onClick();   
	    }
	}
}
