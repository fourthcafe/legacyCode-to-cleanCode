package dev.fourthcafe;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main.main");
		Send send = new Send();
		send.sendRestaurantEventSMS();
	}
}
