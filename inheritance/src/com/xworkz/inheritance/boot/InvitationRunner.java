package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.childClass.WeddingInvitation;
import com.xworkz.inheritance.constant.CardType;

public class InvitationRunner {
	public static void main(String[] args) {

		WeddingInvitation weddingInvitation = new WeddingInvitation(30, 5, CardType.CARD);
		weddingInvitation.display();
	}

}
