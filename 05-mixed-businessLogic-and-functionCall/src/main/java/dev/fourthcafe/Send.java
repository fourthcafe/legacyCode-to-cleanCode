package dev.fourthcafe;

import java.util.List;

public class Send {

	public void sendRestaurantEventSms() {
		MemberManager memberManager = new MemberManager();

		// 기능 1. 호텔 가입 사용자 추출
		final List<Member> members = memberManager.getMember();
		// 기능 2. 가입 사용자중 레스토랑 이용 고객 추출
		List<Member> restaurantMembers = memberManager.getRestaurantMembers(members);
		// 기능 3. 문자 수신 동의 고객 추출
		List<Member> smsMembers = memberManager.getSmsMember(restaurantMembers);
		// 기능 4. 사용자 정보를 통해 사용자에게 맞는 메시지 생성
		final List<Member> customSmsMembers = memberManager.setCustomMessage(smsMembers);
		// 기능 5. 정렬된 문자 발송 로직
		final boolean result = memberManager.sendSms(customSmsMembers);
	}
}
