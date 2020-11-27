package interfaces;

public class KidUsers implements LibraryUser {
	private int age;
	private String bookType;
	
	public KidUsers(int age , String bookType) {
		this.age = age ;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		
		if(age < 12) {
			System.out.println("You have successfully registered as a kid");
		}
		else {
			System.out.println("sorry , age must be less than 12 to register as a kid ");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
	
		if(bookType.equalsIgnoreCase("Kids")){
			System.out.println("return in 10 days Kid !! ");
			
		}
		else {
			System.out.println("This book ai'nt for you kid !!  ");
		}
	}

}
