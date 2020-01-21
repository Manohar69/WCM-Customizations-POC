package com.sivavaka.wcm.custom.workflow;

import java.util.Locale;
import com.ibm.workplace.wcm.api.Document;
import com.ibm.workplace.wcm.api.custom.CustomWorkflowAction;
import com.ibm.workplace.wcm.api.custom.CustomWorkflowActionFactory;

public class SivaTestCustomWcmEmailBodyWorkFlowActionFactory implements CustomWorkflowActionFactory {

	@Override
	public String[] getActionNames() {
		String names[] = { "sendEmailToApprovers", "sendEmailToAuthors", "sendEmailToOwners" };

		return names;
	}

	@Override
	public String getActionTitle(Locale arg0, String arg1) {
		if (arg1.equalsIgnoreCase("sendEmailToApprovers")) {
			return "sendEmailToApprovers";
		} else if (arg1.equalsIgnoreCase("sendEmailToAuthors")) {
			return "sendEmailToAuthors";
		} else if (arg1.equalsIgnoreCase("sendEmailToOwners")) {
			return "sendEmailToOwners";
		}
		return null;
	}
	
	@Override
	public String getActionDescription(Locale arg0, String arg1) {

		if (arg1.equalsIgnoreCase("sendEmailToApprovers")) {
			return "Send Email To Approvers with custom Body";
		} else if (arg1.equalsIgnoreCase("sendEmailToAuthors")) {
			return "Send Email To Authors with custom Body";
		} else if (arg1.equalsIgnoreCase("sendEmailToOwners")) {
			return "Send Email To Oweners with custom Body";
		}
		return "";
	}
	
	@Override
	public CustomWorkflowAction getAction(String arg0, Document arg1) {

		if (arg0.equalsIgnoreCase("sendEmailToApprovers")) {
			return new SivaTestSendEmailToApproversWithCustomBodyWorkFlowAction();
		} else if (arg0.equalsIgnoreCase("sendEmailToAuthors")) {
			return new SivaTestSendEmailToAuthorsWithCustomBodyWorkFlowAction();
		} else if (arg0.equalsIgnoreCase("sendEmailToOwners")) {
			return new SivaTestSendEmailToOwnersWithCustomBodyWorkFlowAction();
		}

		return null;
	}
	
	@Override
	public String getName() {
		return "SivaTestCustomWcmEmailBodyWorkFlowActionFactory";
	}

	@Override
	public String getTitle(Locale arg0) {
		return "Siva Test Customized WCM Notification Email Body ";
	}

}
