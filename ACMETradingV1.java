package ACMETrading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ACMETradingV1 {

	static int orderNo = 0;
	static String ProductOne = "Anvil                  ";
	static String ProductTwo = "Dehydrated Boulder     ";
	static String ProductThree = "Explosive Tennis Balls ";
	static String ProductFour = "Giant Rubber Band      ";
	static String ProductFive = "TNT                    ";

	static float ProductOnePrice = 250;
	static float ProductTwoPrice = 100;
	static float ProductThreePrice = 30;
	static float ProductFourPrice = 50;
	static float ProductFivePrice = 150;

	static int ProductOneQuanity = 0;
	static int ProductTwoQuanity = 0;
	static int ProductThreeQuanity = 0;
	static int ProductFourQuanity = 0;
	static int ProductFiveQuanity = 0;

	static Boolean ProductOneSelected = false;
	static Boolean ProductTwoSelected = false;
	static Boolean ProductThreeSelected = false;
	static Boolean ProductFourSelected = false;
	static Boolean ProductFiveSelected = false;

	static float salesTax = 0;
	static float shippingValue = 0;

	static void welcomeBanner() {
		for (int i = 0; i < 69; i++) {
			System.out.print("$");
		}
		System.out.println("\n$             ACME Trading Corporation 123 Main Street,             $  \n"
				+ "$ Suite 100 Looneytown, USA Welcome to the Mail Order System V. 1.0 $ \n"
				+ "$        Please use this system to place your order with us.        $");
		for (int i = 0; i < 69; i++) {
			System.out.print("$");
		}
	}

	static void mainMenu() {
		System.out.print("Menu : \n" + "Select Option \n" + "1. Order Products \n" + "2. Calculate Shipping \n"
				+ "3. Calculate Sales Tax \n" + "4. Process Order \n" + "5. Exit \n" + "Enter Option : ");
	}

	static void subMenu() {
		System.out.print("Order Products Sub-Menu : \n" + "------------------------- \n" + "Select Product \n" + "A. "
				+ ProductOne + "\n" + "D. " + ProductTwo + " \n" + "E. " + ProductThree + " \n" + "G. " + ProductFour
				+ " \n" + "T. " + ProductFive + " \n" + "X. Exit the Order Products Submenu \n" + "Enter Option : ");
	}

	static void fiftyLines() {
		for (int i = 0; i < 50; i++) {
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			welcomeBanner();
			System.out.print("\n\n\n");

			mainMenu();

			switch (sc.next().charAt(0)) {

			case '1':

				boolean allProductSelected = false;
				while (allProductSelected != true) {

					fiftyLines();
					subMenu();

					char x = sc.next().toUpperCase().charAt(0);

					if (x == 'A') {
						ProductOneSelected = true;
						System.out.print("Enter Quanity : ");
						try {
							int y = sc.nextInt();
							ProductOneQuanity = y;
						} catch (Exception ee) {
							ProductOneQuanity = 1;
						}
					} else if (x == 'D') {
						ProductTwoSelected = true;
						System.out.print("Enter Quanity : ");
						try {
							int y = sc.nextInt();
							ProductTwoQuanity = y;
						} catch (Exception ee) {
							ProductTwoQuanity = 1;
						}
					} else if (x == 'E') {
						ProductThreeSelected = true;
						System.out.print("Enter Quanity : ");
						try {
							int y = sc.nextInt();
							ProductThreeQuanity = y;
						} catch (Exception ee) {
							ProductThreeQuanity = 1;
						}
					} else if (x == 'G') {
						ProductFourSelected = true;
						System.out.print("Enter Quanity : ");
						try {
							int y = sc.nextInt();
							ProductFourQuanity = y;
						} catch (Exception ee) {
							ProductFourQuanity = 1;
						}
					} else if (x == 'T') {
						ProductFiveSelected = true;
						System.out.print("Enter Quanity : ");
						try {
							int y = sc.nextInt();
							ProductFiveQuanity = y;
						} catch (Exception ee) {
							ProductFiveQuanity = 1;
						}
					} else if (x == 'X') {
						allProductSelected = true;
						fiftyLines();

					} else {
						System.out.print("\nWrong Choice Entered Press Enter to Continue ... \n");
						try {
							System.in.read();
						} catch (Exception e) {
						}
					}

				}
				break;

			case '2':
				float total = 0;
				if (ProductOneSelected) {
					total = total + (ProductOnePrice * ProductOneQuanity);
				}
				if (ProductTwoSelected) {
					total = total + (ProductTwoPrice * ProductTwoQuanity);
				}
				if (ProductThreeSelected) {
					total = total + (ProductThreePrice * ProductThreeQuanity);
				}
				if (ProductFourSelected) {
					total = total + (ProductFourPrice * ProductFourQuanity);
				}
				if (ProductFiveSelected) {
					total = total + (ProductFivePrice * ProductFiveQuanity);
				}

				if (total > 0 && total < 100) {
					total = (total * 20) / 100;
				} else if (total >= 100 && total < 250) {
					total = (total * 15) / 100;
				} else if (total >= 250) {
					total = (total * 10) / 100;
				}

				shippingValue = total;

				System.out.print("Total Shipping Cost = " + total);
				System.out.print("\nWrong Choice Entered Press Enter to Continue ... \n");

				try {
					System.in.read();
				} catch (Exception e) {
				}

				break;

			case '3':
				double totals = 0;
				if (ProductOneSelected) {
					totals = totals + (ProductOnePrice * ProductOneQuanity);
				}
				if (ProductTwoSelected) {
					totals = totals + (ProductTwoPrice * ProductTwoQuanity);
				}
				if (ProductThreeSelected) {
					totals = totals + (ProductThreePrice * ProductThreeQuanity);
				}
				if (ProductFourSelected) {
					totals = totals + (ProductFourPrice * ProductFourQuanity);
				}
				if (ProductFiveSelected) {
					totals = totals + (ProductFivePrice * ProductFiveQuanity);
				}

				totals = totals + (float) ((totals * 11.5) / 100);

				salesTax = (float) totals;
				System.out.print("Total Sales Tax = " + totals);
				System.out.print("\nWrong Choice Entered Press Enter to Continue ... \n");

				try {
					System.in.read();
				} catch (Exception e) {
				}

				break;

			case '4':
				fiftyLines();
				orderNo++;
				System.out.print("Order Confirmation Screen\n");
				System.out.print("-------------------------\n");

				System.out.print("Item Name              | Item Quanity | Item Unit Price | Item Extended Price\n");

				if (ProductOneSelected == true) {
					System.out.print("" + ProductOne + "| " + ProductOneQuanity + "           | " + ProductOnePrice
							+ "           | " + (ProductOnePrice * ProductOneQuanity) + "\n");
				}
				if (ProductTwoSelected == true) {
					System.out.print("" + ProductTwo + "| " + ProductTwoQuanity + "           | " + ProductTwoPrice
							+ "           | " + (ProductTwoPrice * ProductTwoQuanity) + "\n");
				}
				if (ProductThreeSelected == true) {
					System.out.print("" + ProductThree + "| " + ProductThreeQuanity + "           | "
							+ ProductThreePrice + "           | " + (ProductThreePrice * ProductThreeQuanity) + "\n");
				}
				if (ProductFourSelected == true) {
					System.out.print("" + ProductFour + "| " + ProductFourQuanity + "           | " + ProductFourPrice
							+ "           | " + (ProductFourPrice * ProductFourQuanity) + "\n");
				}
				if (ProductFiveSelected == true) {
					System.out.print("" + ProductFive + "| " + ProductFiveQuanity + "           | " + ProductFivePrice
							+ "           | " + (ProductFivePrice * ProductFiveQuanity) + "\n");
				}

				System.out.print("-------------------------\n");

				double subTotal = (ProductOnePrice * ProductOneQuanity) + (ProductTwoPrice * ProductTwoQuanity)
						+ (ProductThreePrice * ProductThreeQuanity) + (ProductFourPrice * ProductFourQuanity)
						+ (ProductFivePrice * ProductFiveQuanity);
				double grandTotal = subTotal + salesTax + shippingValue;

				System.out.print("Sub Total : " + subTotal + "\n");
				System.out.print("Shipping Cost : " + shippingValue + "\n");
				System.out.print("Sales Tax : " + salesTax + "\n");
				System.out.print("Grand Total : " + grandTotal + "\n");

				System.out.print("-------------------------\n");

				System.out.print(
						"Select Form of Payment : \n" + "C. Credit\nM. Money Order\nX. Check\n" + "Enter Option : ");
				char x = sc.next().toUpperCase().charAt(0);
				String CreditCardNumber = "";
				String CreditCardExpirationDate = "";
				String CreditCardCVV = "";
				String MoneyOrderNumber = "";
				String RoutingNumber = "";
				String CheckingAccountNumber = "";
				String CheckNumber = "";

				if (x == 'C') {
					System.out.print("\nPlease Enter Credit Card Details : \n");
					System.out.print("Enter Credit Card Number : ");
					CreditCardNumber = sc.next();
					System.out.print("Enter Credit Card Expiration Date : ");
					CreditCardExpirationDate = sc.next();
					System.out.print("Enter Credit Card 3-digit cvv code : ");
					CreditCardCVV = sc.next();

				} else if (x == 'M') {
					System.out.print("\nPlease Enter Money Order Details : \n");
					System.out.print("Enter 5- character Money Order Number : ");
					MoneyOrderNumber = sc.next();

				} else if (x == 'X') {
					System.out.print("\nPlease Enter Check Details : \n");
					System.out.print("Enter The Routing Number : ");
					RoutingNumber = sc.next();
					System.out.print("Enter Checking Account Number : ");
					CheckingAccountNumber = sc.next();
					System.out.print("Enter Check Number : ");
					CheckNumber = sc.next();

				} else {
					System.out.print("Order Would Automatically Be Processed as COD (Cash on Delivery) \n");
				}

				System.out.print("-------------------------\n");

				System.out.print("Do You Want To Submit or Cancel the Order : \n" + "S. Submit\nC. Cancel\n"
						+ "Enter Option : ");
				char y = sc.next().toUpperCase().charAt(0);

				if (y == 'S') {
					System.out.println(
							"-------------------------------------------------------------\nORDER SUCCESSFULLY PLACED\n"
									+ "-------------------------------------------------------------\n");
					String path = "orders.dat";
					File f = new File(path);

					FileWriter fw = null;
					PrintWriter pw = null;
					try {
						if (!f.exists())
							f.createNewFile();
						fw = new FileWriter(f);
						pw = new PrintWriter(fw);

						String order = new String();
						order = "Order Number " + orderNo + "\n";
						order = order.concat("-------------------------\n");

						order = order.concat(
								"Item Name              | Item Quanity | Item Unit Price | Item Extended Price\n");

						if (ProductOneSelected == true) {
							order = order.concat("" + ProductOne + "| " + ProductOneQuanity + "           | "
									+ ProductOnePrice + "           | " + (ProductOnePrice * ProductOneQuanity) + "\n");
						}
						if (ProductTwoSelected == true) {
							order = order.concat("" + ProductTwo + "| " + ProductTwoQuanity + "           | "
									+ ProductTwoPrice + "           | " + (ProductTwoPrice * ProductTwoQuanity) + "\n");
						}
						if (ProductThreeSelected == true) {
							order = order.concat(
									"" + ProductThree + "| " + ProductThreeQuanity + "           | " + ProductThreePrice
											+ "           | " + (ProductThreePrice * ProductThreeQuanity) + "\n");
						}
						if (ProductFourSelected == true) {
							order = order.concat(
									"" + ProductFour + "| " + ProductFourQuanity + "           | " + ProductFourPrice
											+ "           | " + (ProductFourPrice * ProductFourQuanity) + "\n");
						}
						if (ProductFiveSelected == true) {
							order = order.concat(
									"" + ProductFive + "| " + ProductFiveQuanity + "           | " + ProductFivePrice
											+ "           | " + (ProductFivePrice * ProductFiveQuanity) + "\n");
						}

						order = order.concat("-------------------------\n");

						pw.write(order);
						System.out.println("\nOrder saved to file - orders.dat\n");
						pw.flush();
						pw.close();
						fw.close();
						fiftyLines();
					} catch (IOException e) {
						e.printStackTrace();
					}

				} else {
					System.out.println(
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\nORDER HAS BEEN CANCELLED\n"
									+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
				}
				break;

			case '5':
				sc.close();
				return;
			default:

				fiftyLines();
				System.out.println("Wrong Option Selected");

			}

		} while (true);

	}

}
