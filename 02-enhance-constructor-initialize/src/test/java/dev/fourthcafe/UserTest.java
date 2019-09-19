package dev.fourthcafe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void name() {
		// GIVEN

		// WHEN
		User user = new User.Builder("id", "password", "name").build();
		// THEN
		Assertions.assertNotNull(user);
	}
}