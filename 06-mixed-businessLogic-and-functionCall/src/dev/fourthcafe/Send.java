package dev.fourthcafe;

import java.util.ArrayList;
import java.util.List;

public class Send {

	public void sendRestaurantEventSMS() {
		List<Member> members = null;

//		1. 호텔 고객 정보 추출(기능 호출)
		DBManager dbManager = new DBManager();
		members = dbManager.getMember();

//		2. 추출된 고객 정보 중 레스토랑 이용 고객 정보 추출(비즈니스 로직)
		List<Member> restaurantMembers = new ArrayList<>();
		for (Member member : members) {
			if (member.isRestaurantMember()) {
				restaurantMembers.add(member);
			}
		}

//		3. 레스토랑 이용 고객 중 문자 수신 동의 고객 추출(기능 호출)
		List<Member> smsMembers = this.getSmsMember(restaurantMembers);

//		4. 문자 수신 동의 고객별 맞춤 메시지 생성(비즈니스 로직)
		for (int i = 0; i < smsMembers.size(); i++) {
			if ("royal".equals(smsMembers.get(i).getGrade())) {
//				 메시지 생성 및 세팅 로직
			} else if ("basic".equals(smsMembers.get(i).getGrade())) {
//				 메시지 생성 및 세팅 로직
			} else {
//				잘못된 등급 표시 로직
			}
		}

//		5. 문자 발송(기능 호출)
		SmsManager smsManager = new SmsManager();
		smsManager.sendSMS(smsMembers);
	}


	private List<Member> getSmsMember(List<Member> restaurantMembers) {
		List<Member> smsMember = new ArrayList<>();
		for (Member member : restaurantMembers) {
			smsMember = divideSmsMember(smsMember, member);
		}

		return smsMember;
	}


	private List<Member> divideSmsMember(List<Member> smsMembers, Member member) {
		if (checkSMSAgree(member)) {
			smsMembers.add(member);
		}

		return smsMembers;
	}

	private boolean checkSMSAgree(Member member) {
		if (true == member.isAgreeSms()) {
			return true;
		}
		return false;
	}

}
