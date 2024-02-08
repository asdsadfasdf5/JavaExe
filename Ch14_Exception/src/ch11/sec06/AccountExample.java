package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		Account accoutn =  new Account();
		//예금하기
		accoutn.deposit(10000);
		System.out.println("예금액 : "+accoutn.getBalance());
		
		//출금하기
		try {
			accoutn.withdraw(30000);
		} catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}

	}

}
