package PersonalPractice;

import java.util.Scanner;

	public class Zanzs {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("HI! I'M DAN, WELCOME TO ZANZS\n WHAT IS YOUR NAME?");
	String customerName = input.nextLine();

	System.out.println("Enter your Location?");  
	String customerLocation = input.nextLine();

	System.out.println("");

	System.out.printf("Welcome %s\n How might we be of service to you today?", customerName);
	System.out.println("");
	
	System.out.print("Follow me round our store, Trust me to help you select");

		String Silver = null;
		String jewelryStoreEarring = Silver;
		String Gold = null;
		String jewelryStoreNecklace = Gold;
		String Rolex = null;
		String jewelryStoreWristwatch = Rolex;
		String Dior = null;
		String perfumeStore = Dior;
		String Gucci = null;
		String clothingStore = Gucci;
		String Noodlees = null;
		String foodStore = Noodlees;
		String Orange = null;
		String fruitStore = Orange;


	System.out.println("Which store had you like to visit? \n Suggestion: For Jewelry Store, Clothing Store, Food Store, Fruit Store, Perfume Store \n Please type in store ");
	String storeToVisit = input.nextLine();

		String jewelryStoreEaring = new String();
		if (storeToVisit == jewelryStoreEaring)
		{System.out.println("Silver 100000");}

	if (storeToVisit == jewelryStoreNecklace)
		{System.out.println("Gold");}

	if (storeToVisit == jewelryStoreWristwatch)
		{System.out.println("Rolex");}

	if (storeToVisit == perfumeStore)
		{System.out.println("Dior");}

	if (storeToVisit == clothingStore)
		{System.out.println("Gucci");}

	if (storeToVisit == fruitStore)
		{System.out.println("Orange");}
	




	/**if (Cross)
		{System.out.println("5,500");}

	if (Helix)
		{System.out.println("7,000");}

	if (Chain)
		{System.out.println("12,500");}

	if (Cartilage)
		{System.out.println("15,000");}

	if (Stud)
		{System.out.println("4,000");}


	if (storeToVisit = jewelryStoreNecklace) 
		{System.out.println("Bib, Chain, Choker, Collar, Lariat Necklace");}
	if (Bib)
		{System.out.println("69,000");}

	if (Chain)
		{System.out.println("150,000");}

	if (Choker)
		{System.out.println("220,000");}

	if (Collar)
		{System.out.println("175,000");}

	if (Lariat)
		{System.out.println("56,000");}


	if (storeToVisit = jewelryStoreNecklace) 
		{System.out.println("Rolex, Patek, Omega, Gucci,  Wristwatch");}

	System.out.println("Select Wristwatch");
	
	if (Rolex)
		{System.out.println("1,550,000");}

	if (Patek)
		{System.out.println("7,000");}

	if (Omega)
		{System.out.println("12,500");}

	if (Gucci)
		{System.out.println("15,000");}

	if (Bulgari)
		{System.out.println("4,000");}*/


}

}