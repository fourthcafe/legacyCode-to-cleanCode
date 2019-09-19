package dev.fourthcafe;

public class Account {
	private UserService userService;

	User createUser(String id, String password, String name, String address) {
		final User user = new User.Builder(id, password, name)
				.address(address)
				.build();
		return userService.create(user);
	}


	User updateUser(String id, String password, String name, String email, String address, String mobile,
					String passport) {
		User user = new User.Builder(id, password, name)
				.emai(email)
				.address(address)
				.mobile(mobile)
				.passport(passport)
				.build();
		return userService.update(user);
	}
}
