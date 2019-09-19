package dev.fourthcafe;

public class User {
	private String id;
	private String password;
	private String name;
	private String emai;
	private String address;
	private String mobile;
	private String passport;

	public static class Builder {
		private final String id;
		private final String password;
		private final String name;
		private String emai;
		private String address;
		private String mobile;
		private String passport;

		public Builder(String id, String password, String name) {
			this.id = id;
			this.password = password;
			this.name = name;
		}

		public Builder emai(String emai) {
			this.emai = emai;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder mobile(String mobile) {
			this.mobile = mobile;
			return this;
		}

		public Builder passport(String passport) {
			this.passport = passport;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}


	private User(Builder builder) {
		this.id = builder.id;
		this.password = builder.password;
		this.name = builder.name;
		this.emai = builder.emai;
		this.address = builder.address;
		this.mobile = builder.mobile;
		this.passport = builder.passport;
	}

}
