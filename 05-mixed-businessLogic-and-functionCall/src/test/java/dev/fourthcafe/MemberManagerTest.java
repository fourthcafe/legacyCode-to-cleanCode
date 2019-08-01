package dev.fourthcafe;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MemberManagerTest {

	@Test
	public void getMember() {
		// given
		MemberManager memberManager = new MemberManager();
		// when
		List<Member> result = memberManager.getMember();
		// then
		assertNotNull(result);
	}


	@Test
	public void getRestaurantMembers() {
		// given
		MemberManager memberManager = new MemberManager();
		final List<Member> members = memberManager.getMember();
		// when
		final List<Member> result = memberManager.getRestaurantMembers(members);
		// then
		assertNotNull(result);
	}


	@Test
	public void getSmsMembers() {
		// given
		MemberManager memberManager = new MemberManager();
		final List<Member> members = memberManager.getMember();
		final List<Member> restaurantMembers = memberManager.getRestaurantMembers(members);
		// when
		List<Member> result = memberManager.getSmsMember(restaurantMembers);
		// then
		assertNotNull(result);
	}


	@Test
	public void setCustomMessage() {
		// given
		MemberManager memberManager = new MemberManager();
		final List<Member> members = memberManager.getMember();
		final List<Member> restaurantMembers = memberManager.getRestaurantMembers(members);
		final List<Member> smsMembers = memberManager.getSmsMember(restaurantMembers);
		// when
		final List<Member> result = memberManager.setCustomMessage(smsMembers);
		// then
		assertNotNull(result);
	}


	@Test
	public void sendSms() {
		// given
		MemberManager memberManager = new MemberManager();
		final List<Member> members = memberManager.getMember();
		final List<Member> restaurantMembers = memberManager.getRestaurantMembers(members);
		final List<Member> smsMembers = memberManager.getSmsMember(restaurantMembers);
		final List<Member> customMembers = memberManager.setCustomMessage(smsMembers);
		// when
		boolean result = memberManager.sendSms(customMembers);
		// then
		assertTrue(result);
	}
}