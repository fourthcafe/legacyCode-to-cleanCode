package dev.fourthcafe;

import java.util.ArrayList;
import java.util.List;

public class MemberManager {

	public List<Member> getMember() {
		DBManager dbManager = new DBManager();
		return dbManager.getMember();
	}


	public List<Member> getRestaurantMembers(List<Member> members) {
		List<Member> restaurantMembers = new ArrayList<>();
		for (Member member : members) {
			if (member.isRestaurantMember()) {
				restaurantMembers.add(member);
			}
		}

		return restaurantMembers;
	}


	public List<Member> getSmsMember(List<Member> restaurantMembers) {
		List<Member> smsMember = new ArrayList<>();
		for (Member member : restaurantMembers) {
			smsMember = divideSmsMember(smsMember, member);
		}

		return smsMember;
	}


	private List<Member> divideSmsMember(List<Member> smsMembers, Member member) {
		if (member.isSms()) {
			smsMembers.add(member);
		}

		return smsMembers;
	}


	public List<Member> setCustomMessage(List<Member> smsMembers) {
		for (int i = 0; i < smsMembers.size(); i++) {
			if ("royal".equals(smsMembers.get(i).getGrade())) {
//				 메시지 생성 및 세팅 로직
			} else if ("basic".equals(smsMembers.get(i).getGrade())) {
//				 메시지 생성 및 세팅 로직
			} else {
//				잘못된 등급 표시 로직
			}
		}

		return smsMembers;
	}


	public boolean sendSms(List<Member> smsMembers) {
		SmsManager smsManager = new SmsManager();
		return smsManager.sendSms(smsMembers);
	}
}
