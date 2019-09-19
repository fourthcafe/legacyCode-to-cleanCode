package dev.fourthcafe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AccountTest {

	private Account account = new Account();

	@Test
	void createUser_사용자계정생성() {
		// GIVEN
		// WHEN
		final User user = account.createUser("id", "password", "name", "address");
		// THEN
		assertNotNull(user);
	}


	@Test
	void updateUser_사용자계정수정() {
		// GIVEN
		// WHEN
		final User user = account.updateUser("id", "password", "name", "email", "address", "mobilie", "passport");
		// THEN
		assertNotNull(user);
	}
}