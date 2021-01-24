
public class Main {

	public static void main(String[] args) {
		double itemPrice = 22.00;
		double moneyInWallet = 30.00;
		int numofFriends = 80;
		int age = 40;
		String firstName = "David";
		String lastName = "Cueto";
	    char middleIntial = 'N';
	    String favoriteState = "AZ";
		
		//New amount in wallet after buying item.
		System.out.println("Amount in wallet:");
		System.out.println(moneyInWallet - itemPrice);
		//Number of friends per year of age.
		System.out.println("Number of friends per year of age:" + numofFriends / age);
		//Fullname after combining first middle and last.
		System.out.println(firstName + " " + middleIntial + " " + lastName);
		//Variable values
		System.out.println("Price of Item:" + itemPrice);
		System.out.println("Money in Wallet:" + moneyInWallet);
		System.out.println("Number of Friends:" + numofFriends);
		System.out.println("Age:" + age);
		System.out.println("FirstName:" + firstName);
		System.out.println("LastName:" + lastName);
	    System.out.println("Middle Intial:" + middleIntial);
	    System.out.println("My favorite state is:" + favoriteState);
	}

}
