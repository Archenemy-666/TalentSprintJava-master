package interfaces;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kid1 = new KidUsers(10 , "Kids");
		kid1.registerAccount();
		kid1.requestBook();
		
		KidUsers kid2 = new KidUsers(18 , "Fiction");
		kid2.registerAccount();
		kid2.requestBook();
		
		
		AdultUsers adult1 = new AdultUsers(5,"Kids");
		adult1.registerAccount();
		adult1.requestBook();
		
		AdultUsers adult2 = new AdultUsers(23,"Fiction");
		adult2.registerAccount();
		adult2.requestBook();
		
		
		
	}
	

}